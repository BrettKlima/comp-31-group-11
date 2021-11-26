DROP TABLE IF EXISTS client;

DROP TABLE IF EXISTS project;

DROP TABLE IF EXISTS employee;

DROP TABLE IF EXISTS schedule;



CREATE TABLE client
(clientID BIGINT PRIMARY KEY AUTO_INCREMENT,
clientName VARCHAR(80),
clientCompany VARCHAR(80),
clientPhone VARCHAR(80),
clientAddress VARCHAR(80));


CREATE TABLE project
(projectID BIGINT PRIMARY KEY AUTO_INCREMENT,
projLocation VARCHAR(80),
projEstCompleteDate VARCHAR(80),
projEstCompleteCost VARCHAR(80),
projStartDate VARCHAR(80),
projEndDate VARCHAR(80),
clientID BIGINT,
FOREIGN KEY(clientID) REFERENCES client(clientID));


CREATE TABLE employee
(employeeID BIGINT PRIMARY KEY AUTO_INCREMENT,
empName VARCHAR(80),
empEmail VARCHAR(80),
empRole VARCHAR(80),
empPhone VARCHAR(80));


CREATE TABLE schedule
(scheduleID BIGINT PRIMARY KEY AUTO_INCREMENT,
schDay VARCHAR(80),
schMonth VARCHAR(80),
schYear VARCHAR(80),
schStartTime VARCHAR(80),
schEndTime VARCHAR(80),
employeeID BIGINT,
projectID BIGINT,
FOREIGN KEY(employeeID) REFERENCES employee(employeeID),
FOREIGN KEY(projectID) REFERENCES project(projectID));



