<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="Home Page" />
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<body>
<jsp:include page="WEB-INF/jsp/_header.jsp"></jsp:include>


<%--<c:choose>
    <c:when test="${user != null}">--%>
        <jsp:include page="WEB-INF/jsp/_menu.jsp"></jsp:include>
<%--    </c:when>
</c:choose>--%>

</div>
<div id="page" class="container">
    <div class="column1">
        <div class="title">
            <h2><fmt:message key="homeView_jsp.container.column1.h"/></h2>
        </div>
        <p><fmt:message key="homeView_jsp.container.column1.p"/></p>
    </div>
    <div class="column2">
        <div class="title">
            <h2><fmt:message key="homeView_jsp.container.column2.h"/></h2>
        </div>
        <img src="${pageContext.servletContext.contextPath}/resources/style/images/column2.jpg" width="282"  alt="" />
        <p><fmt:message key="homeView_jsp.container.column2.p1"/><br><fmt:message key="homeView_jsp.container.column2.p2"/><br>
            <fmt:message key="homeView_jsp.container.column2.p3"/><br><fmt:message key="homeView_jsp.container.column2.p4"/></p>
    </div>
    <div class="column3">
        <div class="title">
            <h2><fmt:message key="homeView_jsp.container.column3.h"/></h2>
        </div>
        <img src="${pageContext.servletContext.contextPath}/resources/style/images/column3.jpeg" width="282"  alt="" />
        <p><fmt:message key="homeView_jsp.container.column3.p"/></p>
    </div>
</div>

<%--<h3>Home Page</h3>

This is demo Simple web application using jsp,servlet &amp; Jdbc. <br><br>
<b>It includes the following functions:</b>
<ul>
    <li>Login</li>
    <li>Storing user information in cookies</li>
    <li>Product List</li>
    <li>Create Product</li>
    <li>Edit Product</li>
    <li>Delete Product</li>
</ul>--%>

<jsp:include page="WEB-INF/jsp/_footer.jsp"></jsp:include>

</body>
</html>
