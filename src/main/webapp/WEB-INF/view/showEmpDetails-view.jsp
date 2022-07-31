<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, welcome!!!</h2>
<br>
<%--Your name:${param.EmployeeName}--%>

Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your phone number: ${employee.phone_number}
<br><br>
Your email: ${employee.email}
<br><br>
Your car:${employee.car_brand}
<br><br>
Language(s):
<ul>

    <c:forEach var="lang" items ="${employee.languages}">
<li>${lang}</li>
    </c:forEach>

</ul>
<br><br>
</body>
</html>