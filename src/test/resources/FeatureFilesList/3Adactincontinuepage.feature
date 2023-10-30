@continue


Feature: To validate hotels continuepage functionality


Scenario: To select the hotel
Given user launch Adactin application
And user enter username and password
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
And user see the next page Welcome to Adactin Group of Hotels
And user enter the location,hotel,roomtype,numberofrooms
|Sydney|Hotel Creek|Double|2 - Two||
And user enter the check in date and check out date
|21/09/2023|23/09/2023|
And user enter the adults per room,childrens per room
|2 - Two|2 - Two|
And user click search button
And user see the message next page of the select page
When user select the hotel
Then user click continue button

    