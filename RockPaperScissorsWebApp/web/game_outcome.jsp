<%-- 
    Document   : game_outcome
    Created on : 21 May 2026, 10:38:58 PM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game Outcome Page</title>
    </head>
    <body>
        <h1>Game Outcome</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
            String siriSign = (String)session.getAttribute("siriSign");
            String playerSign = (String)request.getAttribute("playerSign");
            String result = (String)request.getAttribute("result");
        %>
        <p>
            <b><%=name%></b>, here is the outcome between you and <b><%=compName%>'s</b> game:
        </p>
        <table>
            <tr>
                <td><b>Siri Sign:</b></td>
                <td><%=siriSign%></td>
            </tr>
            <tr>
                <td><b>Player Sign:</b></td>
                <td><%=playerSign%></td>
            </tr>
            <tr>
                <td><b>Result:</b></td>
                <td><%=result%></td>
            </tr>
        </table>
            <ul>
                <li><a href="play_with_siri.jsp"><b>Continue Playing</b></a></li>
                <li><a href="get_session_summary_outcome.jsp"><b>View The OverAll Game Statistics Of The Session</b></a></li>
                <li><a href="PersistStatisticsServlet.do"><b>End Game</b></a></li>
            </ul>
    </body>
</html>
