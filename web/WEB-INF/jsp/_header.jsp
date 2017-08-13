<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>

<div id="wrapper">
    <div id="header-wrapper">
        <div id="header" class="container">
            <div id="logo">
                <h1><a href="#"><fmt:message key="header_jsp.title"/></a></h1>
                <p><fmt:message key="header_jsp.car_rental_title"/></p>
            </div>
            <div id="social">
                <a class="login-a" href="http://templated.co" rel="nofollow"><fmt:message key="header_jsp.login"/></a>
            </div>
        </div>

<%--<div style="background: #E0E0E0; height: 55px; padding: 5px;">
    <div style="float: left">
        <h1><fmt:message key="header_jsp.h1"/></h1>
    </div>

    <div style="float: right; padding: 10px; text-align: right;">

        <!-- User store in session with attribute: loginedUser -->
        <c:choose>
            <c:when test="${user != null}">
                Hello,
                <div class="dropdown">
                    <button onclick="myFunction()" class="dropbtn">
                        <b>${user.firstName}</b> <b>${user.secondName}</b>
                    </button>
                    <div id="myDropdown" class="dropdown-content">
                        <li type="none"><a href="controller?command=userInfoCommand">
                            <fmt:message key="header_jsp.l1.account"/>
                        </a></li>
                        <li type="none"><a href="controller?command=logoutCommand">
                            <fmt:message key="header_jsp.l1.logout"/>
                        </a></li>
                    </div>
                </div>

            </c:when>
            <c:otherwise>
                <a href="controller?command=getLoginPageCommand">
                    <fmt:message key="header_jsp.l1.login"/>
                </a>
            </c:otherwise>
        </c:choose>

        <br/>
        Search <input name="search">

    </div>

</div>--%>