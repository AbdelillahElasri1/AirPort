<%@ page import="com.abdelillahelasri.airport.entites.Vol" %>
<%@ page import="com.abdelillahelasri.airport.services.VolService" %>
<%@ page import="com.abdelillahelasri.airport.services.Impl.VolServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@include file="Header.jsp"%>
<%--  table flight  --%>
<h2 class="text-center p-6 font-bold">Flights</h2>
<div class="flex flex-col bg-gray-500">
    <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div class="inline-block min-w-full py-2 sm:px-6 lg:px-8">
            <div class="overflow-hidden">
                <table class="min-w-full text-left text-sm font-light">
                    <thead class="border-b font-medium dark:border-neutral-500">
                    <tr>
                        <th scope="col" class="px-6 py-4">date arrive</th>
                        <th scope="col" class="px-6 py-4">date departure</th>
                        <th scope="col" class="px-6 py-4">ville depart</th>
                        <th scope="col" class="px-6 py-4">ville arrive</th>
                        <th scope="col" class="px-6 py-4">heure depart</th>
                        <th scope="col" class="px-6 py-4">heure arrive</th>
                        <th scope="col" class="px-6 py-4">nombre de places disponible</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${vols}" var="vol">
                        <tr class="border-b dark:border-neutral-500">
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.dateArrivee}"/></td>
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.dateDepart}"/></td>
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.villeDepart}"/></td>
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.villeArrivee}"/></td>
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.heureDepart}"/></td>
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.heureArrivee}"/></td>
                            <td class="whitespace-nowrap px-6 py-4"><c:out value="${vol.nombrePlacesDisponibles}"/></td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<%--table flight--%>
<script src="https://cdn.tailwindcss.com"></script>
<%@include file="Footer.jsp"%>
