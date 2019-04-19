# userFront Project
This is a starter spring project 
# Steps to start the project

1. Create an empty Database using wampserver or Xampp with mysql.

2. In the  "application.properities" file change the password and the username for your mysql server (this-> "spring.datasorce.password")

3. After launching the the project for the first time you need to add tow row for the table 'Role' as following:

    >INSERT INTO `role`(`role_id`, `name`) VALUES (0,"ROLE_USER")
    
    >INSERT INTO `role`(`role_id`, `name`) VALUES (1,"ROLE_ADMIN")


