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
	decisionLeft varchar(20),
	decLeftLeadTo varchar(20),
	decRightLeadTo varchar(20)
);
	/*add stuff here for extedning table*/

INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (1,'Kapitel1','Kapitel1.txt','decl1','decr1','Kapitel2','Kapitel3');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (2,'Kapitel2','Kapitel2.txt','decl2','decr2','Kapitel4','Kapitel5');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (3,'Kapitel3','Kapitel3.txt','decl3','decr3','Kapitel5','Kapitel6');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (4,'Kapitel4','Kapitel4.txt','decl4','decr4','Kapitel7','Kapitel7');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (5,'Kapitel5','Kapitel5.txt','decl5','decr5','Kapitel7','Kapitel7');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (6,'Kapitel6','Kapitel6.txt','decl6','decr6','Kapitel8','Kapitel8');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (7,'Kapitel7','Kapitel7.txt','decl7','decr7','Ende','Ende');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (8,'Kapitel8','Kapitel8.txt','decl8','decr8','Ende','Ende');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (9,'Kapitel9','Kapitel9.txt','decl9','decr9','Ende','Ende');
INSERT INTO Story (index,chapterName, fileName,decisionLeft,decisionRight,decLeftLeadTo,decRightLeadTo) VALUES (10,'Kapitel10','Kapitel10.txt','decl10','decr10','Ende','Ende');





select * from Story ;