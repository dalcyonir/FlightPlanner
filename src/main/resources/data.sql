DROP TABLE IF EXISTS flight;
DROP TABLE IF EXISTS airport;
DROP TABLE IF EXISTS aircraft;

CREATE TABLE aircraft (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  aircraft_name VARCHAR(250) NOT NULL
);

INSERT INTO aircraft (aircraft_name) VALUES
  ('Boeing 737'),
  ('Airbus A321'),
  ('Airbus A320'),
  ('Boeing 747-400');

CREATE TABLE airport (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  airport_code VARCHAR(250) NOT NULL,
  airport_city VARCHAR(250) NOT NULL
);

INSERT INTO airport (airport_code, airport_city) VALUES
    ('ATH', 'Athens'),
    ('SKG', 'Thessaloniki'),
    ('HER', 'Heraklion'),
    ('RHO', 'Rhodes');

CREATE TABLE flight(
   id INT AUTO_INCREMENT PRIMARY KEY,
   departure TIMESTAMP,
   arrival TIMESTAMP,
   origin_airport_id INT,
   destination_airport_id INT,
   aircraft_id INT,
   FOREIGN KEY(aircraft_id) REFERENCES aircraft,
   FOREIGN KEY(origin_airport_id) REFERENCES airport,
   FOREIGN KEY(destination_airport_id) REFERENCES airport
);

INSERT INTO flight (departure, arrival, origin_airport_id, destination_airport_id,aircraft_id) VALUES
    (parsedatetime('13-05-2020 10:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 10:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),1,2,1),
    (parsedatetime('13-05-2020 15:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 15:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),1,2,1),
    (parsedatetime('13-05-2020 16:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 16:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),1,2,1),
    (parsedatetime('13-05-2020 18:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 18:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),1,2,1),
    (parsedatetime('13-05-2020 21:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 21:35:00.000','dd-MM-yyyy hh:mm:ss.SSS'),1,4,1),
    (parsedatetime('13-05-2020 10:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 11:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,3,2),
    (parsedatetime('13-05-2020 13:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 13:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,1,2),
    (parsedatetime('13-05-2020 15:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 15:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,1,2),
    (parsedatetime('13-05-2020 15:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 16:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,3,2),
    (parsedatetime('13-05-2020 17:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 18:35:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,4,2),
    (parsedatetime('13-05-2020 18:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 19:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,3,2),
    (parsedatetime('13-05-2020 20:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 21:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,3,2),
    (parsedatetime('13-05-2020 22:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 22:50:00.000','dd-MM-yyyy hh:mm:ss.SSS'),2,1,2),
    (parsedatetime('13-05-2020 09:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 09:25:00.000','dd-MM-yyyy hh:mm:ss.SSS'),3,4,3),
    (parsedatetime('13-05-2020 12:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 12:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'),3,1,3),
    (parsedatetime('13-05-2020 17:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 17:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'),3,1,3),
    (parsedatetime('13-05-2020 20:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 21:30:00.000','dd-MM-yyyy hh:mm:ss.SSS'),3,2,3),
    (parsedatetime('13-05-2020 10:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 11:05:00.000','dd-MM-yyyy hh:mm:ss.SSS'),4,2,4),
    (parsedatetime('13-05-2020 13:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 14:05:00.000','dd-MM-yyyy hh:mm:ss.SSS'),4,2,4),
    (parsedatetime('13-05-2020 20:00:00.000','dd-MM-yyyy hh:mm:ss.SSS'), parsedatetime('13-05-2020 21:05:00.000','dd-MM-yyyy hh:mm:ss.SSS'),4,2,4);