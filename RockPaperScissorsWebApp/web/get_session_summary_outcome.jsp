<%-- 
    Document   : get_session_summary_outcome
    Created on : 21 May 2026, 10:55:41 PM
    Author     : Ryan
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Session Summary Outcome Page</title>
    </head>
    <body>
        <h1>Get Session Summary Outcome</h1>
        <%
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            Long id = (Long)session.getAttribute("id");
            String name = (String)session.getAttribute("name");
            Integer cnt = (Integer)session.getAttribute("cnt");
            Integer cntLost = (Integer)session.getAttribute("cntLost");
            Integer cntWon = (Integer)session.getAttribute("cntWon");
            Integer cntTie = (Integer)session.getAttribute("cntTie");
            List<String> siriSigns = (List<String>)session.getAttribute("siriSigns");
            List<String> playerSigns = (List<String>)session.getAttribute("playerSigns");
        %>
        <p>
            <b><%=name%></b>, below is the session's overall game statistics between you and <b><%=compName%></b>:
        </p>
        <table>
            <tr>
                <td><b>Name:</b></td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td><b>ID:</b></td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td><b>Number of Games Played:</b></td>
                <td><%=cnt%></td>
            </tr>
            <tr>
                <td><b>Number of Games Won By Siri:</b></td>
                <td><%=cntLost%></td>
            </tr>
            <tr>
                <td><b>Number of Games Won By Player:</b></td>
                <td><%=cntWon%></td>
            </tr>
            <tr>
                <td><b>Number of Games Tied:</b></td>
                <td><%=cntTie%></td>
            </tr>
            <tr>
                <td><b>Siri's Signs:</b></td>
                <td><%=siriSigns%></td>
            </tr>
            <tr>
                <td><b>Players Signs:</b></td>
                <td><%=playerSigns%></td>
            </tr>
        </table>
        <ul>
                <li><a href="play_with_siri.jsp"><b>Continue Playing</b></a></li>
                <li><a href="PersistStatisticsServlet.do"><b>End Game</b></a></li>
        </ul>
    </body>
</html>
