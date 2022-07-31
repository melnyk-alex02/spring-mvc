<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, enter your details</h2>
<br>
<br>

<form:form action = "showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path = "name"/>
    <br><br>
    Surname <form:input path = "surname"/>
    <form:errors path = "surname"/>
    <br><br>
    Salary <form:input path = "salary"/>
    <form:errors path = "salary"/>
    <br><br>
    phone number<form:input path ="phone_number"/>
    <form:errors path = "phone_number"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path = "email"/>
    Department <form:select path="department">
    <form:options items = "${employee.departments}"/>
</form:select>
    <br><br>
    which car do you want to purchase?
    <form:radiobuttons path = "car_brand" items ="${employee.cars}"/>
    <br>
    Do you know foreign languages?
    <form:checkboxes path="languages" items="${employee.languagesMap}"/>
    <br>
    <input type = "submit" value = "OK">
</form:form>
</body>
</html>