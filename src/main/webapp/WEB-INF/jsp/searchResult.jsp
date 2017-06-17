<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>uandex</title>
</head>
<body>

<c:out value="${keyword}"/>

<br/>

<c:out value="${result}"/>

<br/>

<ul>
    <c:forEach items="${result}" var="res">
        <li><a href="${res.url}">
                ${res.title}
        </a>
            <br>
            <c:out value="${res.textSample}"/>
        </li>
    </c:forEach>
</ul>

</body>
</html>
