<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title></title>

</head>
<body>
<h1> 회원 리스트를 보여줄 예정입니다</h1>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${members}" var="m">
<h3>아이디 <a href="http://localhost:8081/mvc/crud/get?id=${m.key }" > ${m.key }</a>  : 이름 ${m.value }</h3>
</c:forEach>
</body>
</html>






