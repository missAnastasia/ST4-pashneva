<%@ page isErrorPage="true" %>
<%@ page import="java.io.PrintWriter" %>
<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="Success" scope="page" />
<%@ include file="/WEB-INF/jspf/head_main.jspf" %>

<html>

<c:set var="title" value="Home Page" />
<%@ include file="/WEB-INF/jspf/head_main.jspf" %>

<body>
<jsp:include page="_header_client.jsp"/>
<jsp:include page="_menu_client.jsp"/>

</div>
<div id="page" class="container">
    <div class="title">
        <h2><fmt:message key="error_page_jsp.title"/></h2>
    </div>
    <table id="main-container">

        <tr >
            <td class="content">
                <%-- CONTENT --%>


                <%-- this way we obtain an information about an exception (if it has been occurred) --%>
                <c:set var="code" value="${requestScope['javax.servlet.error.status_code']}"/>
                <c:set var="err_message" value="${requestScope['javax.servlet.error.message']}"/>
                <c:set var="exception" value="${requestScope['javax.servlet.error.exception']}"/>

                <c:if test="${not empty code}">
                    <h3>Error code: ${code}</h3>
                </c:if>

                <c:if test="${not empty err_message}">
                    <h3>${err_message}</h3>
                </c:if>

                <c:if test="${not empty exception}">
                    <% exception.printStackTrace(new PrintWriter(out)); %>
                </c:if>

                <%-- if we get this page using forward --%>
                <c:if test="${not empty requestScope.errorMessage}">
                    <h3>${requestScope.errorMessage}</h3>
                </c:if>

                <%-- CONTENT --%>
            </td>
        </tr>



    </table>
</div>
<jsp:include page="_footer.jsp"/>
</body>
</html>