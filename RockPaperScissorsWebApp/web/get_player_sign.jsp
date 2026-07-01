<%-- 
    Document   : get_player_sign
    Created on : 21 May 2026, 10:08:45 PM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Player Sign Page</title>
    </head>
    <body>
        <h1>Get Player Sign</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Okay <b><%=name%></b>, it is your turn to guess a sign.
        </p>
        <p>
            Enter your sign below:
        </p>
        <form action="GetPlayerSignServlet.do" method="POST">
            <table>
                <tr>
                    <td>Siri Sign:</td>
                    <td>XXX</td>
                </tr>
                <tr>
                    <td>Player Sign:</td>
                    <td>
                        <select name="playerSign">
                            <option value="Rock">Rock</option>
                            <option value="Paper">Paper</option>
                            <option value="Scissor">Scissor</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GO"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
