<%-- 
    Document   : view_all_statistics_outcome
    Created on : 21 May 2026, 11:23:00 PM
    Author     : Ryan
--%>

<%@page import="java.util.Date"%>
<%@page import="za.ac.tut.entities.Statistics"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Statistics Outcome Page</title>
    </head>
    <body>
        <h1>View All Statistics Outcome</h1>
        <%
            List<Statistics> list = (List<Statistics>)request.getAttribute("list");
            String compName = pageContext.getServletContext().getInitParameter("comp_name");
            String nameSess = (String)session.getAttribute("name");
        %>
        <p>
            <b><%=nameSess%></b>, <b><%=compName%></b> provided you with a list of all the game statistics below:
        </p>
        <table border='1'>
        <%
            for(int x = 0; x < list.size(); x++){
                Statistics s = list.get(x);
                Long id = s.getId();
                String name = s.getName();
                Integer cnt = s.getCnt();
                Integer cntLost = s.getCntLost();
                Integer cntWon = s.getCntWon();
                Integer cntTie = s.getCntTie();
                List<String> siriSigns = s.getSiriSigns();
                List<String> playerSigns = s.getPlayerSigns();
                Date creationDate = s.getCreationDate();
        %>
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
            <tr>
                <td><b>Creation Date:</b></td>
                <td><%=creationDate%></td>
            </tr>
            <tr>
                <td></td>
            </tr>
        <%
            }
        %>
        </table>
        <ul>
                <li><a href="menu.jsp"><b>Menu Page</b></a></li>
                <li><a href="EndSessionServlet.do"><b>Logout</b></a></li>
        </ul>
    </body>
</html>
