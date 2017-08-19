<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="Home Page" />
<%@ include file="/WEB-INF/jspf/head_main.jspf" %>

<body>
<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu_client.jsp"></jsp:include>

</div>
<div id="page" class="container">
    <div class="title">
        <h2><fmt:message key="login_jsp.h2"/></h2>
    </div>

    <div id="login-div">
        <form  action="controller?command=loginCommand"0 autocomplete="on" method="post">
            <h3>
                <label for="login" class="login"><fmt:message key="login_jsp.label.login"/></label>
                <input id="login" name="login" type="email" placeholder="example@site.com" maxlength="45" required/>
                <span class="form__error"><fmt:message key="validation.login"/></span>
            </h3>
            <h3>
                <label for="password" class="password"><fmt:message key="login_jsp.label.password"/></label>
                <input id="password" name="password" minlength="8" maxlength="45" required type="password" placeholder="Xx1_" pattern="\w+"/>
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


<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>
