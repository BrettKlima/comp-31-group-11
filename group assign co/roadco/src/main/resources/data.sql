INSERT INTO CLIENT(CLIENTID,CLIENTNAME,CLIENTCOMPANY,CLIENTPHONE,CLIENTADDRESS) VALUES
(NULL, 'John', 'Big Company', '111-111-1111', '103 queen street'),
(NULL, 'Ralph', 'Wreck IT', '222-222-2222', '99 main street');

INSERT INTO EMPLOYEE(EMPLOYEEID,EMPLOYEEFIRSTNAME,EMPLOYEELASTNAME,EMPLOYEEEMAIL,EMPLOYEEROLE,EMPLOYEEPHONE) VALUES
(NULL, 'Eric', 'Cartman'   , 'cartman@gmail.com'      , 'Labourer' , '111-111-1111'),
(NULL, 'John', 'Bigman'    , 'bigman@gmail.com'       , 'Labourer' , '222-222-2222'),
(NULL, 'Ron', 'Weasley'    , 'rweasleyn@gmail.com'    , 'Labourer' , '333-333-3333'),
(NULL, 'JR', 'Sweezy'      , 'sweezyexpress@gmail.com', 'Labourer' , '444-444-4444'),
(NULL, 'Bob', 'Mackenzie'  , 'mackdaddy@gmail.com'    , 'Labourer' , '555-555-5555'),
(NULL, 'Dale', 'Doback'    , 'dale@gmail.com'         , 'Operator' , '666-666-6666'),
(NULL, 'Brennan', 'Huff'   , 'huffer@gmail.com'       , 'Operator' , '777-777-7777'),
(NULL, 'Jared', 'Macdonald'   , 'sub@gmail.com'          , 'Operator' , '888-888-8888'),
(NULL, 'Jillion', 'Choi'   , 'jilchoi@gmail.com'      , 'Foreman'  , '999-999-9999'),
(NULL, 'Kayden', 'Houston' , 'houstonshow@gmail.com'  , 'Foreman'  , '111-112-1010'),
(NULL, 'Alfredo', 'Parmesan', 'marinara@gmail.com'    , 'Foreman'  , '888-888-9999');

INSERT INTO SCHEDULE(SCHEDULEID,SCHDAY,SCHMONTH,SCHYEAR,SCHSTARTTIME,SCHENDTIME,EMPLOYEEID,PROJECTID) VALUES
(NULL, '01', '05', '2021', '0800','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Eric'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '05', '21', '2021', '0800','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'John'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Bird Watching') ),
(NULL, '01', '05', '2021', '1000','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Ron'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '01', '05', '2021', '1000','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'JR'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '01', '25', '2021', '1000','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Bob'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Bird Watching') ),
(NULL, '03', '05', '2021', '1000','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Dale'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '01', '05', '2021', '1100','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Brennan'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '01', '05', '2021', '1000','1600', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Jared'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '02', '02', '2021', '1000','1300', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Jillion'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '01', '05', '2021', '1000','1700', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Kayden'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Road Paving') ),
(NULL, '01', '06', '2021', '0600','2000', (SELECT EMPLOYEEID FROM EMPLOYEE WHERE EMPLOYEEFIRSTNAME = 'Alfredo'), (SELECT PROJECTID FROM PROJECT WHERE PROJLOCATION = 'Bird Watching') );


INSERT INTO PROJECT(PROJECTID,PROJLOCATION,PROJESTCOMPLETEDATE,PROJESTCOMPLETECOST,PROJSTARTDATE,PROJENDDATE,CLIENTID) VALUES
(NULL, 'Road Paving', '11-11-22', '.99', '11-11-21', '10-10-22', (SELECT CLIENTID FROM CLIENT WHERE CLIENTNAME = 'John')),
(NULL, 'Bird Watching', '11-11-22', '.99', '11-11-21', '10-10-22', (SELECT CLIENTID FROM CLIENT WHERE CLIENTNAME = 'Ralph'));

