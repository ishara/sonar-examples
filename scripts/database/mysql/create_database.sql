# Create SonarQube database and user.
#
# Command: mysql -u root -p < create_database.sql
#

CREATE DATABASE sonarqube CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE USER 'sonar' IDENTIFIED BY 'sonar';
GRANT ALL ON sonarqube.* TO 'sonar'@'%' IDENTIFIED BY 'sonar';
GRANT ALL ON sonarqube.* TO 'sonar'@'localhost' IDENTIFIED BY 'sonar';
FLUSH PRIVILEGES;
