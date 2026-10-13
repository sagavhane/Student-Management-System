
CREATE DATABASE IF NOT EXISTS student_db;

USE student_db;

CREATE TABLE IF NOT EXISTS students (
    roll_number INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    marks DOUBLE NOT NULL,
    PRIMARY KEY (roll_number)
) ENGINE=InnoDB
  DEFAULT CHARSET=utf8mb4
  COLLATE=utf8mb4_0900_ai_ci;
