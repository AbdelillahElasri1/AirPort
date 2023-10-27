<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./css/footer.css">
</head>
<body>
    <%@include file="Header.jsp"%>
    <%--  Home page start --%>
    <main class="container mx-auto mt-8 p-4">
        <section class="mb-8">
            <h2 class="text-2xl font-semibold mb-4">Search for Flights</h2>
            <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                <div class="bg-white p-4 rounded shadow-md">
                    <form>
                        <div class="mb-4">
                            <label for="departure" class="block text-gray-600">Departure</label>
                            <input type="text" id="departure" class="w-full border rounded px-3 py-2">
                        </div>
                        <div class="mb-4">
                            <label for="destination" class="block text-gray-600">Destination</label>
                            <input type="text" id="destination" class="w-full border rounded px-3 py-2">
                        </div>
                        <div class="mb-4">
                            <label for="date" class="block text-gray-600">Date</label>
                            <input type="date" id="date" class="w-full border rounded px-3 py-2">
                        </div>
                        <button class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Search</button>
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
                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Flight 1</h3>
                    <p>Departure: New York</p>
                    <p>Destination: Los Angeles</p>
                    <p>Date: 2023-11-15</p>
                    <p>Price: $250</p>
                    <button class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Book Now</button>
                </div>

                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Flight 2</h3>
                    <p>Departure: Chicago</p>
                    <p>Destination: Miami</p>
                    <p>Date: 2023-12-05</p>
                    <p>Price: $300</p>
                    <button class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Book Now</button>
                </div>

                <div class="bg-white p-4 rounded shadow-md">
                    <h3 class="text-xl font-semibold mb-2">Flight 3</h3>
                    <p>Departure: Los Angeles</p>
                    <p>Destination: New York</p>
                    <p>Date: 2023-12-20</p>
                    <p>Price: $220</p>
                    <button class="bg-blue-500 text-white px-4 py-2 rounded hover-bg-blue-600">Book Now</button>
                </div>
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

    </main>
    <%--  Home page end  --%>
    <%@include file="Footer.jsp"%>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="./js/footer.js"></script>
</body>
</html>