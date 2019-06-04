# userFront Project
This is a starter spring project 
# Steps to start the project

In order to run the project please follow the instructions:
## Step 1:
Unzip the "userfront.zip" and open the folder using Intelij IDEA or Eclipse IDEA
make sure that all the dependencies are installed and working properly in the file pom.xml.


## Step 2:
Run Xampp or wampserver64 to run apache and sql server
go to phpmyadmin and create an empty database with the name "OnlineBanking".

## Step 3: 
Open "application.properties" file and enter the correct information about your database name and connection information.

## Step 4: 
lunch the project and check the browser in : localhost:8080
After launching the the project for the first time you need to add tow row for the table 'Role' manually as following:

    >INSERT INTO `role`(`role_id`, `name`) VALUES (0,"ROLE_USER")
    
    >INSERT INTO `role`(`role_id`, `name`) VALUES (1,"ROLE_ADMIN")
