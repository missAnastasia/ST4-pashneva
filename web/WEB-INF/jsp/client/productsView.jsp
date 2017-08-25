<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="Conditions Page" />
<%@ include file="/WEB-INF/jspf/head_main.jspf" %>

<body>
<jsp:include page="../_header_client.jsp"/>
<jsp:include page="../_menu_client.jsp"/>

</div>
<div id="page" class="container">
    <div class="title">
        <h2><fmt:message key="conditions_jsp.h2"/></h2>
    </div>
    <div>

            <c:forEach items="${products}" var="product">

                <div>
                    <p>${product.id}</p><br>
                    <p>Company: ${product.company}</p><br>
                    <p>Model: ${product.model}</p><br>
                    <p>Body type: ${product.bodyType}</p><br>
                    <p>Engine power: ${product.enginePower}</p><br>
                    <p>Max speed: ${product.maxSpeed}</p><br>
                    <p>Color: ${product.color}</p><br>
                    <p>Class: ${product.className}</p><br>
                    <p>Price: ${product.price}</p><br>
                    <p>Status: ${product.carStatus}</p><br>
                </div>

            </c:forEach>

    </div>

</div>

<jsp:include page="../_footer.jsp"/>

</body>
</html>
