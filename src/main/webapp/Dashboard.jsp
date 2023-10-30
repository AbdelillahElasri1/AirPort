<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="bg-gray-900 min-h-screen flex items-center justify-center">
    <div class="bg-gray-800 flex-1 flex flex-col space-y-5 lg:space-y-0 lg:flex-row lg:space-x-10 max-w-6xl sm:p-6 sm:my-2 sm:mx-4 sm:rounded-2xl">
        <!-- Navigation -->
        <div class="bg-gray-900 px-2 lg:px-4 py-2 lg:py-10 sm:rounded-xl flex lg:flex-col justify-between">
            <nav class="flex items-center flex-row space-x-2 lg:space-x-0 lg:flex-col lg:space-y-2">
                <a class="text-white/50 p-4 inline-flex justify-center rounded-md hover:bg-gray-800 hover:text-white smooth-hover" href="${pageContext.request.contextPath}/home">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 sm:h-6 sm:w-6" viewBox="0 0 20 20" fill="currentColor">
                        <path d="M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z" />
                    </svg>
                </a>
                <!-- Active: bg-gray-800 text-white, Not active: text-white/50 -->
                <a class="bg-gray-800 text-white p-4 inline-flex justify-center rounded-md" href="#">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 sm:h-6 sm:w-6" viewBox="0 0 20 20" fill="currentColor">
                        <path d="M9 6a3 3 0 11-6 0 3 3 0 016 0zM17 6a3 3 0 11-6 0 3 3 0 016 0zM12.93 17c.046-.327.07-.66.07-1a6.97 6.97 0 00-1.5-4.33A5 5 0 0119 16v1h-6.07zM6 11a5 5 0 015 5v1H1v-1a5 5 0 015-5z" />
                    </svg>
                </a>
                <a class="text-white/50 p-4 inline-flex justify-center rounded-md hover:bg-gray-800 hover:text-white smooth-hover" href="#">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 sm:h-6 sm:w-6" viewBox="0 0 20 20" fill="currentColor">
                        <path fill-rule="evenodd" d="M3.172 5.172a4 4 0 015.656 0L10 6.343l1.172-1.171a4 4 0 115.656 5.656L10 17.657l-6.828-6.829a4 4 0 010-5.656z" clip-rule="evenodd" />
                    </svg>
                </a>
            </nav>
            <div class="flex items-center flex-row space-x-2 lg:space-x-0 lg:flex-col lg:space-y-2">
                <a class="text-white/50 p-4 inline-flex justify-center rounded-md hover:bg-gray-800 hover:text-white smooth-hover" href="#">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 sm:h-6 sm:w-6" viewBox="0 0 20 20" fill="currentColor">
                        <path fill-rule="evenodd" d="M11.49 3.17c-.38-1.56-2.6-1.56-2.98 0a1.532 1.532 0 01-2.286.948c-1.372-.836-2.942.734-2.106 2.106.54.886.061 2.042-.947 2.287-1.561.379-1.561 2.6 0 2.978a1.532 1.532 0 01.947 2.287c-.836 1.372.734 2.942 2.106 2.106a1.532 1.532 0 012.287.947c.379 1.561 2.6 1.561 2.978 0a1.533 1.533 0 012.287-.947c1.372.836 2.942-.734 2.106-2.106a1.533 1.533 0 01.947-2.287c1.561-.379 1.561-2.6 0-2.978a1.532 1.532 0 01-.947-2.287c.836-1.372-.734-2.942-2.106-2.106a1.532 1.532 0 01-2.287-.947zM10 13a3 3 0 100-6 3 3 0 000 6z" clip-rule="evenodd" />
                    </svg>
                </a>
                <a class="text-white/50 p-4 inline-flex justify-center rounded-md hover:bg-gray-800 hover:text-white smooth-hover" href="#">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 sm:h-6 sm:w-6" viewBox="0 0 20 20" fill="currentColor">
                        <path fill-rule="evenodd" d="M3 3a1 1 0 011 1v12a1 1 0 11-2 0V4a1 1 0 011-1zm7.707 3.293a1 1 0 010 1.414L9.414 9H17a1 1 0 110 2H9.414l1.293 1.293a1 1 0 01-1.414 1.414l-3-3a1 1 0 010-1.414l3-3a1 1 0 011.414 0z" clip-rule="evenodd" />
                    </svg>
                </a>
            </div>
        </div>
        <!-- Content -->
        <div class="flex-1 px-2 sm:px-0">
            <div class="flex justify-between items-center">
                <h3 class="text-3xl font-extralight text-white/50">Groups</h3>
                <div class="inline-flex items-center space-x-2">
                    <a class="bg-gray-900 text-white/50 p-2 rounded-md hover:text-white smooth-hover" href="#">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2H6a2 2 0 01-2-2V6zM14 6a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2V6zM4 16a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2H6a2 2 0 01-2-2v-2zM14 16a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2v-2z" />
                        </svg>
                    </a>
                    <a class="bg-gray-900 text-white/50 p-2 rounded-md hover:text-white smooth-hover" href="#">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 10h16M4 14h16M4 18h16" />
                        </svg>
                    </a>
                </div>
            </div>
            <div class="mb-10 sm:mb-0 mt-10 grid gap-4 grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4">
                <div class="group bg-gray-900/30 py-20 px-4 flex flex-col space-y-2 items-center cursor-pointer rounded-md hover:bg-gray-900/40 hover:smooth-hover">
                    <button id="open-reservation-modal" class="bg-gray-900/70 text-white/50 group-hover:text-white group-hover:smooth-hover flex w-20 h-20 rounded-full items-center justify-center" >
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-10 w-10" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="1" d="M12 6v6m0 0v6m0-6h6m-6 0H6" />
                        </svg>
                    </button>
                    <a class="text-white/50 group-hover:text-white group-hover:smooth-hover text-center" href="#">Create group</a>
                </div>
                <c:forEach items="${volList}" var="vols">
                    <div class="relative group bg-gray-900 py-10 sm:py-20 px-4 flex flex-col space-y-2 items-center cursor-pointer rounded-md hover:bg-gray-900/80 hover:smooth-hover">
                        <img class="w-20 h-20 object-cover object-center rounded-full" src="https://images.unsplash.com/photo-1547592180-85f173990554?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1170&q=80" alt="cuisine" />
                        <h4 class="text-white text-2xl font-bold capitalize text-center">Flight</h4>
                        <p class="text-white/50">Departure: <c:out value="${vols.villeDepart}"/></p>
                        <p class="text-white/50">Destination: <c:out value="${vols.villeArrivee}"/></p>
                        <p class="text-white/50">Date: <c:out value="${vols.dateDepart}"/></p>
                        <p class="text-white/50"><p>Disponible places: <c:out value="${vols.nombrePlacesDisponibles}"/></p>
                    </div>
                </c:forEach>

            </div>
        </div>
    </div>
</div>
<%--    pop up start    --%>
<div class="fixed inset-0 flex items-center justify-center z-50 hidden" id="reservation-modal">
    <div class="modal-container">
        <div class="modal-content p-8 bg-slate-400 rounded-lg shadow-lg">
            <h2 class="text-2xl font-bold mb-4">add flight</h2>

            <form action="${pageContext.request.contextPath}/saveFlight" method="post">
                <!-- Input fields for reservation details -->
                <div class="mb-4">
                    <label for="datedepart" class="block text-sm font-medium">date de depart</label>
                    <input type="date" id="datedepart" name="datedepart" class="w-full  border-gray-300 bg-white">
                </div>
                <div class="mb-4">
                    <label for="datearrivee" class="block text-sm font-medium">date arrivee</label>
                    <input type="date" id="datearrivee" name="datearrivee" class="w-full  border-gray-300 bg-white">
                </div>
                <div class="mb-4">
                    <label for="heuredepart" class="block text-sm font-medium">heure de depart</label>
                    <input type="time" id="heuredepart" name="heuredepart" class="w-full  border-gray-300 bg-white">
                </div>
                <div class="mb-4">
                    <label for="heurearrivee" class="block text-sm font-medium">heure arrivee</label>
                    <input type="time" id="heurearrivee" name="heurearrivee" class="w-full  border-gray-300 bg-white">
                </div>
                <div class="mb-4">
                    <label for="nombreplacesdisponible" class="block text-sm font-medium">nombre de place disponible</label>
                    <input type="text" id="nombreplacesdisponible" name="nombreplacesdisponible" class="w-full  border-gray-300 bg-white">
                </div>
                <div class="mb-4">
                    <label for="villedepart" class="block text-sm font-medium">ville de depart</label>
                    <input type="text" id="villedepart" name="villedepart" class="w-full  border-gray-300 bg-white">
                </div>
                <div class="mb-4">
                    <label for="villearrivee" class="block text-sm font-medium">ville d'arrive</label>
                    <input type="text" id="villearrivee" name="villearrivee" class="w-full  border-gray-300 bg-white">
                </div>
                <!-- Add more input fields for flight details, date, etc. -->

                <button type="submit" id="showSweetAlert" value="" class="bg-blue-500 hover:bg-blue-700 text-white font-semibold py-2 px-4 rounded-lg">
                    add Flight
                </button>
            </form>

            <button id="close-reservation-modal" class="modal-close mt-4 text-gray-600 hover:text-gray-800">Cancel</button>
        </div>
    </div>
</div>

<%--    pop up end    --%>
<script src="${pageContext.request.contextPath}/js/popUp.js"></script>
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
