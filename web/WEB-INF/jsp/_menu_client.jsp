<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<%--
<div style="padding: 5px;">

    &lt;%&ndash;<a href="${pageContext.request.contextPath}/homeView.jsp">Home</a>
    |
    <a href="controller?command=getEditUserPageCommand">Edit User</a>
    |
    <a href="controller?command=userInfoCommand">My Account Info</a>
    |
    <a href="controller?command=getLoginPageCommand">Login</a>&ndash;%&gt;

</div>--%>


<div id="menu" class="container">
    <ul>
        <li class="current_page_item"><a href="${pageContext.request.contextPath}/homeView.jsp" accesskey="1" title=""><fmt:message key="header_jsp.menu.client.homepage"/></a></li>
        <li><a href="${pageContext.request.contextPath}/aboutView.jsp" accesskey="1" title=""><fmt:message key="header_jsp.menu.client.about_us"/></a></li>

        <c:choose>
            <c:when test="${user != null}">
                <li><a href="#" accesskey="2" title=""><fmt:message key="header_jsp.menu.client.car_park"/></a></li>
                <li><a href="#" accesskey="3" title=""><fmt:message key="header_jsp.menu.client.rental_conditions"/></a></li>
                <li><a href="#" accesskey="4" title=""><fmt:message key="header_jsp.menu.client.careers"/></a></li>
            </c:when>
        </c:choose>
        <li><a href="${pageContext.request.contextPath}/contactsView.jsp" accesskey="5" title=""><fmt:message key="header_jsp.menu.client.contact_us"/></a></li>

    </ul>
</div>