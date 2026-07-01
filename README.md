# Rock Paper Scissors Web App - INT316D Exam Project

## Overview
A Java EE web application implementing the classic Rock Paper Scissors game with:
- MVC Architecture
- Stateful Session Beans
- Role-based security (Admin, Player, Owner)
- Database persistence (MySQL/PostgreSQL)
- Session management

## Tech Stack
- Java EE / J2EE
- Servlets & JSP
- EJB (Stateful Session Beans)
- MySQL/PostgreSQL
- GlassFish/Tomcat

## Setup Instructions
1. Import project into NetBeans/Eclipse
2. Create database: `TextSpectaclesP24B`
3. Run SQL scripts from `/database` folder
4. Deploy WAR file to server
5. Access at: `http://localhost:8080/...`

## Credentials
- Player: normal_user / 123
- Owner: super_user / 123

## Features
- [x] User authentication with roles
- [x] Play against "Siri"
- [x] Game statistics tracking
- [x] Database persistence
- [x] Personalized user experience
