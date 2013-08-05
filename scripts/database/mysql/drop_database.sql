# Drop SonarQube database and user.
#
# Command: mysql -u root -p < drop_database.sql
#

DROP DATABASE IF EXISTS sonarqube;
DROP USER 'sonarqube'@'localhost';
DROP USER 'sonarqube'@'%';