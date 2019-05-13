/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Paul
 * Created: 10.05.2019
 */

DROP TABLE Story;
  
CREATE TABLE Story (
	index smallint,
	chapterName  varchar(30),	
	fileName varchar(20),
	decisionRight varchar(20),
	decisionLeft varchar(20)
);
	/*add stuff here for extedning table*/

INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (1,'Kapitel1','test1.txt','decl1','decr1');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (2,'Kapitel2','test2.txt','decl2','decr2');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (3,'Kapitel3','test3.txt','decl3','decr3');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (4,'Kapitel4','test4.txt','decl4','decr4');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (5,'Kapitel5','test5.txt','decl5','decr5');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (6,'Kapitel6','test6.txt','decl6','decr6');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (7,'Kapitel7','test7.txt','decl7','decr7');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (8,'Kapitel8','test8.txt','decl8','decr8');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (9,'Kapitel9','test9.txt','decl9','decr9');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight) VALUES (10,'Kapitel10','test10.txt','decl10','decr10');



select * from Story ;