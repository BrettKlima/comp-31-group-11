DROP TABLE IF EXISTS CLIENT;

DROP TABLE IF EXISTS PROJECT;

DROP TABLE IF EXISTS EMPLOYEE;

DROP TABLE IF EXISTS SCHEDULE;



CREATE TABLE CLIENT
(CLIENTID BIGINT PRIMARY KEY AUTO_INCREMENT,
CLIENTNAME VARCHAR(80),
CLIENTCOMPANY VARCHAR(80),
CLIENTPHONE VARCHAR(80),
CLIENTADDRESS VARCHAR(80));


CREATE TABLE PROJECT
(PROJECTID BIGINT PRIMARY KEY AUTO_INCREMENT,
PROJLOCATION VARCHAR(80),
PROJESTCOMPLETEDATE VARCHAR(80),
PROJESTCOMPLETECOST VARCHAR(80),
PROJSTARTDATE VARCHAR(80),
PROJENDDATE VARCHAR(80),
CLIENTID BIGINT,
FOREIGN KEY(CLIENTID) REFERENCES CLIENT(CLIENTID));


CREATE TABLE EMPLOYEE
(EMPLOYEEID BIGINT PRIMARY KEY AUTO_INCREMENT,
EMPNAME VARCHAR(80),
EMPEMAIL VARCHAR(80),
EMPROLE VARCHAR(80),
EMPPHONE VARCHAR(80));


CREATE TABLE SCHEDULE
(SCHEDULEID BIGINT PRIMARY KEY AUTO_INCREMENT,
SCHDAY VARCHAR(80),
SCHMONTH VARCHAR(80),
SCHYEAR VARCHAR(80),
SCHSTARTTIME VARCHAR(80),
SCHENDTIME VARCHAR(80),
EMPLOYEEID BIGINT,
PROJECTID BIGINT,
FOREIGN KEY(EMPLOYEEID) REFERENCES EMPLOYEE(EMPLOYEEID),
FOREIGN KEY(PROJECTID) REFERENCES PROJECT(PROJECTID));



