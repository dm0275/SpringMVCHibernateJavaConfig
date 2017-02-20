<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <link href="<c:url value="/resources/css/Master.css"/>" rel="stylesheet">
    <title>Countries</title>
</head>
<body>
<form:form method="post" modelAttribute="country" action="/Spring/addCountry">
    <table>
        <tr>
            <th colspan="2">Add Country</th>
        </tr>
        <tr>
            <form:hidden path="id" />
            <td><form:label path="countryName">Country Name:</form:label></td>
            <td><form:input path="countryName" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="population">Population:</form:label></td>
            <td><form:input path="population" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" class="blue-button" /></td>
        </tr>
    </table>
</form:form>
</br>
<h3>Country List</h3>
<c:if test="${!empty listOfCountries}">
    <table class="tg">
        <tr>
            <th width="80">Id</th>
            <th width="120">Country Name</th>
            <th width="120">Population</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listOfCountries}" var="country">
            <tr>
                <td>${country.id}</td>
                <td>${country.countryName}</td>
                <td><fmt:formatNumber type="number" maxFractionDigits="3" value="${country.population}" /></td>
                <td><a href="<c:url value='/Spring/updateCountry/${country.id}' />" >Edit</a></td>
                <td><a href="<c:url value='/Spring/deleteCountry/${country.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>