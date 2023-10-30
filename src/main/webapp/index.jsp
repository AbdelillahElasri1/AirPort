<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./css/footer.css">
</head>
<body>
    <%@include file="Header.jsp"%>
    <%--  Home page start --%>
    <main class="container mx-auto mt-8 p-4 bg-gray-100">
        <section class="mb-8">
            <h2 class="text-2xl font-semibold mb-4">Search for Flights</h2>
            <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                <div class="bg-white p-4 rounded shadow-md">
                    <form>
                        <div class="mb-4">
                            <label for="search" class="block text-gray-600">Departure</label>
                            <input type="text" id="search"  class="w-full border rounded px-3 py-2" data-search>
                        </div>
                        <div class="mb-4">
                            <label for="destination" class="block text-gray-600">Destination</label>
                            <input type="text" id="destination" class="w-full border rounded px-3 py-2">
                        </div>
                        <div class="mb-4">
                            <label for="date" class="block text-gray-600">Date</label>
                            <input type="date" id="date" class="w-full border rounded px-3 py-2">
                        </div>
                        <button class="  bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Search</button>
                    </form>
                </div>

                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Popular Destinations</h3>
                    <ul>
                        <li>New York</li>
                        <li>Los Angeles</li>
                        <li>Chicago</li>
                        <li>Miami</li>
                    </ul>
                </div>
            </div>
        </section>

        <section class="mb-8">
            <h2 class="text-2xl font-semibold mb-4">Featured Flights</h2>
            <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
                <!-- Featured flight listings go here -->
                <c:forEach items="${volList}" var="vols">
                    <div class=" Names bg-orange-400 p-4 rounded shadow-md">
                        <h3 class="text-xl font-semibold mb-2">Flight</h3>
                        <p class="PNames">Departure: <c:out value="${vols.villeDepart}"/></p>
                        <p>Destination: <c:out value="${vols.villeArrivee}"/></p>
                        <p>Date: <c:out value="${vols.dateDepart}"/></p>
                        <p>Disponible places: <c:out value="${vols.nombrePlacesDisponibles}"/></p>
                        <p>Price: $250</p>
                        <button id="open-reservation-modal" class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Book Now</button>
                    </div>
                </c:forEach>
            </div>
        </section>

        <section class="mb-8">
            <h2 class="text-2xl font-semibold mb-4">Special Offers</h2>
            <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
                <!-- Special offers or deals go here -->
                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Offer 1</h3>
                    <p>Destination: Paris</p>
                    <p>Price: $500</p>
                    <p>Travel Dates: 2024-01-10 to 2024-02-10</p>
                    <button class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Book Now</button>
                </div>

                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Offer 2</h3>
                    <p>Destination: Rome</p>
                    <p>Price: $450</p>
                    <p>Travel Dates: 2024-03-15 to 2024-04-15</p>
                    <button class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Book Now</button>
                </div>

                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Offer 3</h3>
                    <p>Destination: Tokyo</p>
                    <p>Price: $600</p>
                    <p>Travel Dates: 2024-05-01 to 2024-05-31</p>
                    <button class="bg-blue-500 text-white px-4 py-2 rounded hover-bg-blue-600">Book Now</button>
                </div>
            </div>
        </section>
<%--    pop up start    --%>
        <div class="fixed inset-0 flex items-center justify-center z-50 hidden" id="reservation-modal">
            <div class="modal-container">
                <div class="modal-content p-8 bg-slate-400 rounded-lg shadow-lg">
                    <h2 class="text-2xl font-bold mb-4">Flight Reservation</h2>

                    <form action="EmailServlet" method="post">
                        <!-- Input fields for reservation details -->
                        <div class="mb-4">
                            <label for="name" class="block text-sm font-medium">Name</label>
                            <input type="text" id="name" name="name" class="w-full  border-gray-300 bg-white">
                        </div>

                        <div class="mb-4">
                            <label for="email" class="block text-sm font-medium">Email</label>
                            <input type="email" id="email" name="to" class="w-full border-gray-300 bg-white">
                        </div>

                        <!-- Add more input fields for flight details, date, etc. -->

                        <button type="submit" id="showSweetAlert" value="send email" class="bg-blue-500 hover:bg-blue-700 text-white font-semibold py-2 px-4 rounded-lg">
                            Reserve Flight
                        </button>
                    </form>

                    <button id="close-reservation-modal" class="modal-close mt-4 text-gray-600 hover:text-gray-800">Cancel</button>
                </div>
            </div>
        </div>

    <%--    pop up end    --%>

    </main>
    <%--  Home page end  --%>
    <%@include file="Footer.jsp"%>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="./js/popUp.js"></script>
    <script src="./js/footer.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<%--    <script src="sweetalert2.all.min.js"></script>--%>
    <script>
        document.getElementById('showSweetAlert').addEventListener('click', function() {
            Swal.fire({
                position: 'top-end',
                icon: 'success',
                title: 'Your work has been saved',
                showConfirmButton: false,
                timer: 8000
            });
        });

            const search = document.getElementById("search");
            const searchInput = document.querySelector("[data-search]");
            const Names = document.querySelectorAll(".Names");
            //var for second function
            const items = document.querySelectorAll(".PNames");




            //second method of search
            searchInput.addEventListener("input", (e) => {
            let itemshidden = 0;
            const value = e.target.value;

            for (let i = 0; i < Names.length; i++) {
            //for showing all items
            if (value.length == items[i].innerText.toLowerCase().includes(value.toLowerCase())) {
            Names[i].style.display = "block";
        }
            //for showing searched items
            if (items[i].innerText.toLowerCase().includes(value.toLowerCase())) {
            Names[i].style.display = 'block';

        } else {
            //for hiding items
            Names[i].style.display = "none";
            //for counting hidden items
            itemshidden++;
        }
        }
            //for no items
            if (itemshidden==(items.length)){
            document.getElementById("noitem").style.display ='block';
            //for resetting hidden items
            itemshidden==0;
        }else{document.getElementById("noitem").style.display ='none';}
        })
    </script>
</body>
</html>