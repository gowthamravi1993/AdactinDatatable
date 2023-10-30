
Feature: To validate Adactin login functionality
Scenario: To validate login using valid username and password
Given user launch Adactin application
When user enter username and password
|username  |password |
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
Then user see the next page Welcome to Adactin Group of Hotels