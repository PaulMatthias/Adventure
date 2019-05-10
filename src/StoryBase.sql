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
	panelType varchar(20)
)
	/*add stuff here for extedning table*/

INSERT INTO Story (index, chapterName, fileName, panelType) 
VALUES(1,'Kapitel 1','test.txt','general');

INSERT INTO Story (index, chapterName, fileName, panelType) 
VALUES(2,'Kapitel 2','test2.txt','general');

select * from Story ;