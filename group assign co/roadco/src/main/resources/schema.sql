DROP TABLE IF EXISTS client;

CREATE TABLE client
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientName VARCHAR(80) ),
(clientCompany VARCHAR(80) ),
(clientPhone VARCHAR(80) ),
(clientAddress VARCHAR(80) );


CREATE TABLE employee
(employeeID BIGINT PRIMARY KEY AUTO_INCREMENT),
(empName BIGINT PRIMARY KEY AUTO_INCREMENT),
(empEmail BIGINT PRIMARY KEY AUTO_INCREMENT),
(empRole BIGINT PRIMARY KEY AUTO_INCREMENT),
(empPhone BIGINT PRIMARY KEY AUTO_INCREMENT);
/*
    emp name
    emp email
    emp role
    emp phone
*/

CREATE TABLE schedule
(scheduleID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT);
/*
    proj id fk
    emp id fk
    day
    month
    year
    start time
    end time

*/

CREATE TABLE project
(projectID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT),
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT);
/*
    proj location
    proj estimated complete date
    proj estimated code
    proj start date
    proj end date
    client id FK
*/