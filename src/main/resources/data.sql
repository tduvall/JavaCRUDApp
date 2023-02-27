DROP TABLE IF EXISTS CUSTOMERS;

CREATE TABLE CUSTOMERS (
  id BIGINT PRIMARY KEY,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL,
  grade VARCHAR(250) NOT NULL,
  address1 VARCHAR(250) NOT NULL,
  address2 VARCHAR(250),
  city VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  postal VARCHAR(250) NOT NULL
);

INSERT INTO CUSTOMERS (id, firstName, lastName, grade, address1, address2, city, state, postal) VALUES
  (1, 'Taylor', 'Duvall', '12', '123 Sesame Street', '', 'New York', 'New York', '12345'),
  (2, 'Megan', 'Holiday', '6', '17 Main Street', 'Apt C', 'Portland', 'Oregon', '52342'),
  (3, 'Arnold', 'Schwarz', '2', 'The Moon', '', 'Outer Space', 'Oklahoma', '77840'),
  (64, 'Ronald', 'McDonald', 'Unknown', '12 Russellville Road', '', 'Bowling Green', 'KY', '42101');