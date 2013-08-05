# Create SonarQube database and user.
#
# Command: mysql -u root -p < create_database.sql
#

CREATE DATABASE sonarqube CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE USER 'sonarqube' IDENTIFIED BY 'sonarqube';
GRANT ALL ON sonarqube.* TO 'sonarqube'@'%' IDENTIFIED BY 'sonarqube';
GRANT ALL ON sonarqube.* TO 'sonarqube'@'localhost' IDENTIFIED BY 'sonarqube';
FLUSH PRIVILEGES;