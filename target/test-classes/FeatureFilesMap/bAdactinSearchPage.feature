Feature: To validate hotels Searchpage functionality

Scenario: To validate login using valid username and password
Given user launch Adactin application
When user enter username and password
|username  |password |
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
When user enter the location,hotel,roomtype,numberofrooms
|location|hotel      |roomtype|numberofrooms|
|Sydney  |Hotel Creek|Double  |2 - Two      |
|London|Hotel Hervey|Standard|1 - One|
And user enter the check in date and check out date
|check in date|check out date|
|21/09/2023   |23/09/2023|
And user enter the adults per room,childrens per room
|adults per room|childrens per room|
|2 - Two        |2 - Two|
And user click search button
Then user see the message next page of the select page


