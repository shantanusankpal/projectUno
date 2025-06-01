CREATE DATABASE IF NOT EXISTS myapp_db;
USE myapp_db;

CREATE TABLE book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    taken_date DATE NOT NULL,
    return_status BOOLEAN DEFAULT FALSE,
    return_date DATE
);
