# Spring_Boot_Server
Run server using the command line: '''./gradlew bootRun''' for default port 8080

Server setup using Spring Boot

Setup initial project with https://start.spring.io/
This project is setup with Gradle - Groovy, Java, and Java 21 (https://www.oracle.com/java/technologies/downloads/)
Check for java version "21" when cmd'''java -version''' in Windows

Also, need Intellij Idea to open and alter the project code.
Open the project in Intellij Idea, and ensure that the Java version is correct File -> Project Structure

Create a database at cloud.mongodb.com
Add the Cluster name and url link into application.properties using the template below
spring.data.mongodb.database=<Cluster_Name>
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<pwacluster.5db9niy.mongodb.net/>