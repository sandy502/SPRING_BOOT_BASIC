SELECT CURTIME();
 
SELECT CURDATE();
 
SELECT NOW();
 
 CREATE TABLE peoplebirthday (
	name VARCHAR(100),
    birthdate DATE,
    birthtime TIME,
    birthdt DATETIME
);
 
INSERT INTO peoplebirthday (name, birthdate, birthtime, birthdt)
VALUES ('Elton', '2000-12-25', '11:00:00', '2000-12-25 11:00:00');
 
INSERT INTO peoplebirthday (name, birthdate, birthtime, birthdt)
VALUES ('Lulu', '1985-04-11', '9:45:10', '1985-04-11 9:45:10');
 
INSERT INTO peoplebirthday (name, birthdate, birthtime, birthdt)
VALUES ('Juan', '2020-08-15', '23:59:00', '2020-08-15 23:59:00');

SELECT 
    birthdate,
    DAY(birthdate),
    DAYOFWEEK(birthdate),
    DAYOFYEAR(birthdate)
FROM peoplebirthday;
 
SELECT 
    birthdate,
    MONTHNAME(birthdate),
    YEAR(birthdate)
FROM peoplebirthday;

SELECT 
    birthtime,
    HOUR(birthtime),
    MINUTE(birthtime)
FROM peoplebirthday;
 
SELECT 
    birthdt,
    MONTH(birthdt),
    DAY(birthdt),
    HOUR(birthdt),
    MINUTE(birthdt)
FROM peoplebirthday;


-- Beginner to intermediate SQL

-- https://www.educba.com/data-science/data-science-tutorials/mysql-tutorial/

-- https://www.w3resource.com/mysql/mysql-tutorials.php

-- https://www.geeksforgeeks.org/sql-tutorial/?ref=gcse

-- https://www.mysqltutorial.org/

-- https://www.w3schools.com/sql/

-- https://www.geeksengine.com/database/sample/

-- https://www.khanacademy.org/computing/computer-programming/sql/

-- More advanced SQL

-- https://www.hackerrank.com/domains/sql

-- https://leetcode.com/study-plan/sql/

-- https://www.tutorialspoint.com/mysql/index.htm

-- https://sqlzoo.net/wiki/SQL_Tutorial

-- YouTube Creators (advanced)

-- https://www.youtube.com/c/techTFQ

-- https://www.youtube.com/c/LearnatKnowstar

-- https://www.youtube.com/channel/UCfGTc8zyBjCGg-Ilc4oAxEg/videos

SELECT birthdate, DATE_FORMAT(birthdate, '%a %b %D') FROM peoplebirthday;
 
SELECT birthdt, DATE_FORMAT(birthdt, '%H:%i') FROM peoplebirthday;
 
SELECT birthdt, DATE_FORMAT(birthdt, 'BORN ON: %r') FROM peoplebirthday;

select birthday from peoplebirthday;

CREATE TABLE captions (
  text VARCHAR(150),
  created_at TIMESTAMP default CURRENT_TIMESTAMP
);
 
CREATE TABLE captions2 (
  text VARCHAR(150),
  created_at TIMESTAMP default CURRENT_TIMESTAMP,
  updated_at TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- TIMESTAMP value converts from the current time to UTC and vice-versa while DATETIME does not do any conversion.

SELECT DAYOFWEEK(CURDATE());
SELECT DAYOFWEEK(NOW());
SELECT DATE_FORMAT(NOW(), '%w') + 1;
 
SELECT DAYNAME(NOW());
SELECT DATE_FORMAT(NOW(), '%W');
 
SELECT DATE_FORMAT(CURDATE(), '%m/%d/%Y');
 
SELECT DATE_FORMAT(NOW(), '%M %D at %h:%i');

CREATE TABLE tweets(
    content VARCHAR(140),
    username VARCHAR(20),
    created_at TIMESTAMP DEFAULT NOW()
);
