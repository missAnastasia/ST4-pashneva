<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>
<c:set var="title" value="Login Page" />
<%@ include file="/WEB-INF/jspf/head_main.jspf" %>

<body>

<jsp:include page="WEB-INF/jsp/_header.jsp"></jsp:include>
<jsp:include page="WEB-INF/jsp/_menu_client.jsp"></jsp:include>

</div>
<div id="page" class="container">
    <div class="title">
        <h2><fmt:message key="login_jsp.h2"/></h2>
    </div>

    <div id="login-div">
        <form  action="/" autocomplete="on" method="post">
            <h3>
                <label for="login" class="login"><fmt:message key="login_jsp.label.login"/></label>
                <input id="login" name="login" type="email" placeholder="mymail@mail.com" maxlength="45" required/>
                <span class="form__error"><fmt:message key="validation.login"/></span>
            </h3>
            <h3>
                <label for="password" class="password"><fmt:message key="login_jsp.label.password"/></label>
                <input id="password" name="password" minlength="3" maxlength="45" required type="password" placeholder="xxxxxxxx" />
                <span class="form__error"><fmt:message key="validation.password"/></span>
            </h3>
            <h3 class="keeplogin">
                <input type="checkbox" name="rememberMe" value="Y" id="loginkeeping"/>
                <label for="loginkeeping"><fmt:message key="login_jsp.label.remember_me"/></label>
            </h3>
             <input type="submit" value="<fmt:message key="login_jsp.label.submit"/>"/>

            <p class="change_link">
                <fmt:message key="login_jsp.label.not_a_member"/>
                <a href="" class="to_register"><fmt:message key="login_jsp.label.sign_in"/></a>
            </p>
        </form>
    </div>

</div>



<%--<h3>Login Page</h3>

<p style="color: red;">${errorString}</p>

<form method="POST" action="controller?command=loginCommand">
    <table border="0">
        <tr>
            <td>Login</td>
            <td><input type="text" name="login" value= "${user.login}" /> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password" value= "${user.password}" /> </td>
        </tr>
        <tr>
            <td>Remember me</td>
            <td><input type="checkbox" name="rememberMe" value= "Y" /> </td>
        </tr>
        <tr>
            <td colspan ="2">
                <input type="submit" value= "Submit" />
                <a href="${pageContext.request.contextPath}/">Cancel</a>
            </td>
        </tr>
    </table>
</form>

<p style="color:blue;">User Name: tom, password: tom001 or jerry/jerry001</p>--%>

<jsp:include page="WEB-INF/jsp/_footer.jsp"></jsp:include>

</body>
</html>
