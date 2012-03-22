CREATE TABLE PROCESSES 
(
  PROCESS_ID INTEGER NOT NULL 
, PROCESS_TYPE SMALLINT NOT NULL 
, PROCESS_STATUS SMALLINT NOT NULL 
, CONFIGURATION XMLTYPE 
, INSTALLATION_DATE DATE NOT NULL 
, PROCESS_NAME VARCHAR2(1000) 
, PROCESS_EPR VARCHAR2(1000) 
, USER_ID INTEGER NOT NULL 
, CONSTRAINT PROCESSES_PK PRIMARY KEY 
  (
    PROCESS_ID 
  )
  ENABLE 
);

ALTER TABLE PROCESSES
ADD CONSTRAINT PROCESSES_UK1 UNIQUE 
(
  PROCESS_EPR 
)
ENABLE;

ALTER TABLE PROCESSES
ADD CONSTRAINT PROCESSES_USERS_FK1 FOREIGN KEY
(
  USER_ID 
)
REFERENCES USERS
(
  USER_ID 
)
ENABLE;

CREATE INDEX PROCESSES_INDEX1 ON PROCESSES (PROCESS_TYPE);

CREATE INDEX PROCESSES_INDEX2 ON PROCESSES (PROCESS_STATUS);

CREATE INDEX PROCESSES_INDEX3 ON PROCESSES (USER_ID);

CREATE SEQUENCE PROCESS_ID_SEQUENCE INCREMENT BY 1 START WITH 1 CACHE 20;
