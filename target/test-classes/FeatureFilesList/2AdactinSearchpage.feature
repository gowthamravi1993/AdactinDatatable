@searchpage

Feature: To validate hotels Searchpage functionality
Background:
Given user launch Adactin application
And user enter username and password
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
And user see the next page Welcome to Adactin Group of Hotels


Scenario: To search the valid location,hotel,roomtype,numberofrooms
When user enter the location,hotel,roomtype,numberofrooms
|Sydney|Hotel Creek|Double|2 - Two||
And user enter the check in date and check out date
|21/09/2023|23/09/2023|
And user enter the adults per room,childrens per room
|2 - Two|2 - Two|
And user click search button
Then user see the message next page of the select page

#Scenario: To validate login using valid username and password
#When user enter the valid location,hotel,roomtype,numberofrooms
#|location|Sydney|
#|hotel|Hotel Creek|
#|roomtype|Double|
#|numberofrooms|2 - Two||
#And user enter the check in date and check out date
#|21/09/2023|23/09/2023|
#And user enter the adults per room,childrens per room
#|2 - Two|2 - Two|
#And user click search button
#Then user see the message next page of the select page

Scenario: To search the invalid location,hotel,roomtype,numberofrooms
When user enter the invalid location,valid hotel,valid roomtype,valid numberofrooms
|location|hotel|roomtype|numberofrooms|
|Sydney|Hotel Creek|Double|2 - Two|
|India|Hotel Creek|Double|2 - Two|
And user enter the check in date and check out date
|21/09/2023|23/09/2023|
And user enter the adults per room,childrens per room
|2 - Two|2 - Two|
And user click search button
Then user see the error message of the displayed