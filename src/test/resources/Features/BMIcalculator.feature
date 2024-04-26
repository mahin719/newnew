Feature: BMI calculator


Scenario Outline: Calculate BMI using height and weight
Given user is in webmd BMI calculator website
When user enter height in feet '<feet>' and inches '<inches>'
And user enter weight in pounds '<pounds>'
And user click calculate button
Then user will be able to see the BMI number '<Result>'



Examples: 
| feet  | inches | pounds |Result|
|  6    |   8    |  160   |24.3|

