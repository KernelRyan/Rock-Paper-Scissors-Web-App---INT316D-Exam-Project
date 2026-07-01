<%-- 
    Document   : view_specific_statistics
    Created on : 21 May 2026, 11:33:25 PM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Statistics Of A Specific Player Page</title>
    </head>
    <body>
        <h1>View Statistics Of A Specific Player</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            <b><%=name%></b>, enter the ID of the <b>Players Statistics</b> you want to see
        </p>
        <form action="GetSpecificStatisticServlet.do" method="POST">
            <table>
                <tr>
                    <td>Players ID:</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="FIND"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
