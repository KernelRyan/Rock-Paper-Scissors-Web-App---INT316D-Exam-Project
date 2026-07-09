-- Create database
CREATE DATABASE IF NOT EXISTS TextSpectaclesP24B;
USE TextSpectaclesP24B;

-- Create Statistics table
CREATE TABLE IF NOT EXISTS Statistics (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    cnt INT DEFAULT 0,
    cntLost INT DEFAULT 0,
    cntWon INT DEFAULT 0,
    cntTie INT DEFAULT 0,
    siriSigns VARCHAR(1000),
    playerSigns VARCHAR(1000),
    creationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);