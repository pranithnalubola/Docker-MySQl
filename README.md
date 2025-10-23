Project to Demonstrate the working of Dockerfile with Springboot and MySQL 
create a springboot emp project
run the project with MySQL database
initiate a EC2 instace to run the application
install docker, openjdk17 and maven
create a MySql database container with the root and password credentials
create network to launch MYSQL and connect it with MySQL container
change the application.properties file JDBC url (localhost with the mySQL container name)
rename the Dockerfile /target/.jar file in COPY command
build the maven project using mvn clean package -DskipTests command
create the docker image of the springboot project
using the image run the container using the network we created
check with docker ps command if both the container are running
