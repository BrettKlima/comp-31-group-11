INSERT INTO CLIENT(CLIENTID,CLIENTNAME,CLIENTCOMPANY,CLIENTPHONE,CLIENTADDRESS) VALUES
(NULL, 'John', 'Big Company', '111-111-1111', '103 queen street');

INSERT INTO employee(employeeID,empName,empEmail,empRole,empPhone) VALUES
(NULL, 'Eric Cartman', 'cartman@gmail.com', 'worker', '222-222-2222');

INSERT INTO schedule(scheduleID,schDay,schMonth,schYear,schStartTime,schEndTime,employeeID,projectID) VALUES
(NULL, 'Monday', 'May', '2021', '0800','1600', (SELECT employeeID FROM employee WHERE empName = 'Eric Cartman'), (SELECT projectID FROM project WHERE projLocation = 'man') );

INSERT INTO project(projectID,projLocation,projEstCompleteDate,projEstCompleteCost,projStartDate,projEndDate,clientID) VALUES
(NULL, 'man', '11-11-22', '.99', '11-11-21', '10-10-22', (SELECT clientID FROM client WHERE clientName = 'John'));

