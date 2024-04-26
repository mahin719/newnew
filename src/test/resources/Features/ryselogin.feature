Feature: rysefuel login validation


Scenario Outline: login using valid email and password
Given user is in rysefuel website
When user user click the account button
And user enter valid email '<email>'
And user enter valid password '<password>'
And user click the login button
Then user will be able to login



Examples: 
| email               | password       |
| 07redking@gmail.com | QApractice4224 |

