<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>
<c:set var="title" value="Account Info Page" />
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>

<h3>Hello, ${user.login}</h3>

Login: <b>${user.login}</b>
<br />
First name: ${user.firstName } <br />

<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>
