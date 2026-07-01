<%-- 
    Document   : menu
    Created on : 21 May 2026, 9:49:00 PM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h1>Menu</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=name%></b>, <b><%=compName%></b> here.
        </p>
        <p>
            Select one of the following:
        </p>
        <ol>
            <li><a href="play_with_siri.jsp">Play With Siri</a></li>
            <li><a href="ViewAllStatisticsServlet.do">View All The Games Statistics</a></li>
            <li><a href="view_specific_statistics.jsp">View Statistics Of A Specific Player</a></li>
            <li><a href="ViewWonStatisticsServlet.do">View Games Statistics Of Players That Won</a></li>
        </ol>
    </body>
</html>
