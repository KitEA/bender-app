DROP TABLE IF EXISTS futurama;

CREATE TABLE futurama (
  id INT AUTO_INCREMENT PRIMARY KEY,
  season INT NOT NULL,
  episode INT NOT NULL,
  episode_in_season INT NOT NULL,
  title VARCHAR(250) NOT NULL,
  director VARCHAR(250) NOT NULL,
  writer VARCHAR(250) NOT NULL,
  air_date DATE NOT NULL,
  opening_line VARCHAR(250) NOT NULL
);