Feature: To validate hotel booking page functionality

Scenario: To validate login using valid username and password
Given user launch Adactin application
When user enter username and password
|username  |password |
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
And user enter the location,hotel,roomtype,numberofrooms
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
And user see the message next page of the select page
And user select the hotel
And user click continue button
When user enter the firstname,lastname,Address,credit card number
|firstname|lastname|Address   |credit card number|
|Gowtham  |Ravi    |coimbatore|2343565789098765|
And user select the credit card type,expiry month,expiry year,enter the cvv number
|credit card type|expiry month|expiry year|enter the cvv number|
|VISA            |January     |2030       |2343                |
And user click book now button
And order number is generated
Then user logout the page
  
