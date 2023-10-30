@login
Feature: To validate Adactin login functionality
Background:
Given user launch Adactin application

Scenario: To validate login using valid username and password
When user enter username and password
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
Then user see the next page Welcome to Adactin Group of Hotels

Scenario: To validate login using valid username and invalid password
When user enter valid username and invalid password
|username|vaithy2410|
|password|vaithy@2411|
And user click login button
Then user see the error message of invalid login 

Scenario: To validate login using invalid username and valid password
When user enter invalid username and valid password
|username|password     |
|vaithy2410|vaithy@2410|
|vaithy2410|vaithy@2411|
And user click login button
Then user see the error message of result based

Scenario Outline: To validate login using invalid username and valid password
When user enter username "<username>"and password "<password>"
And user click login button
Then user see the result based on credential type "<credentialType>"
Examples:
|username  |  password |credentialType|
|vaithy2410|vaithy@2410|positive|
|vaithy2410|vaithy@2411|negative|