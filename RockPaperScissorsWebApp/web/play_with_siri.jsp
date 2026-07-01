<%-- 
    Document   : play_with_siri
    Created on : 21 May 2026, 9:59:45 PM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Play With Siri Page</title>
    </head>
    <body>
        <h1>Play With Siri</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            <b><%=name%></b>, you are now playing with <b><%=compName%></b>.
        </p>
        <p>
            Click the button below to get Siri's sign:
        </p>
        <form action="GetSiriSignServlet.do" method="GET">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="PLAY"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
