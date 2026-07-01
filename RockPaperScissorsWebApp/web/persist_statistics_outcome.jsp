<%-- 
    Document   : persist_statistics_outcome
    Created on : 21 May 2026, 11:10:59 PM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persist Statistics Outcome Page</title>
    </head>
    <body>
        <h1>Persist Statistics Outcome</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Thank you <b><%=name%></b>.
        </p>
        <p>
            Your <b>Game Statistics</b> have been successfully stored in the database.
        </p>
        <ul>
                <li><a href="menu.jsp"><b>Menu Page</b></a></li>
                <li><a href="EndSessionServlet.do"><b>Logout</b></a></li>
        </ul>
    </body>
</html>
