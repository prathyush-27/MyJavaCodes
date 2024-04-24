<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="col.College"%>
<jsp:useBean id="college"  class="col.College">
    <%-- intialize bean properties --%>
    <jsp:setProperty name="college" property="name" value="St Josephs college"/>
    <jsp:setProperty name="college" property="principal" value="Fr Arockiasamy SJ"/>
</jsp:useBean>

<html>
	<body>
	<h2>
	    College.....	<jsp:getProperty name="college" property="name"/><br>
	    Principal.....	<jsp:getProperty name="college" property="principal"/>
	</body>
</html>