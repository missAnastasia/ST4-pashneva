<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>
<c:set var="title" value="Login Page" />
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<body>

<jsp:include page="/WEB-INF/jsp/_header.jsp"></jsp:include>
<jsp:include page="/WEB-INF/jsp/_menu.jsp"></jsp:include>

<h3>Create User Page</h3>

<p style="color: red;">${errorString}</p>

<form method="POST" action="controller?command=createUserCommand">
    <table border="0">
        <tr>
            <td>Login</td>
            <td><input type="text" name="login" value= "${editUser.login}" /> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password" value= "${editUser.password}" /> </td>
        </tr>
        <tr>
            <td>First name</td>
            <td><input type="text" name="firstName" value= "${editUser.firstName}" /> </td>
        </tr>
        <tr>

        <tr>
            <td>Second name</td>
            <td><input type="text" name="secondName" value= "${editUser.secondName}" /> </td>
        </tr>
        <tr>

        <tr>
            <td>Role</td>
            <td>
                <select name="role">
                    <c:forEach items="${roles}" var="role">
                        <%--<c:set var="selected" value="${role.getRoleOrdinal(role.getName()) == editUser.roleId ? 'selected' : '' }"/>--%>
                        <option value="${role.getName()}" ${selected}>${role.getName()}</option>
                    </c:forEach>
                </select>
                <select name="status">
                    <c:forEach items="${statuses}" var="status">
                        <%--<c:set var="selected" value="${role.getRoleOrdinal(role.getName()) == editUser.roleId ? 'selected' : '' }"/>--%>
                        <option value="${status.getName()}" ${selected}>${status.getName()}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan ="2">
                <input type="submit" value= "Submit" />
                <a href="${pageContext.request.contextPath}/">Cancel</a>
            </td>
        </tr>
    </table>
</form>

<jsp:include page="/WEB-INF/jsp/_footer.jsp"></jsp:include>

</body>
</html>
