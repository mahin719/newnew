Feature: Facebook signup validation


Scenario Outline: signup facebook using Phone number and Email

Given user is in facebook signup page
When user enter firstname '<FirstName>' and last name '<LastName>'
And user enter Phone number '<Phn Number>'
And user enter Password '<Passwword>'
And user select date of birth '<Month>' and '<Day>' and '<Year>'
And user select gender '<Gender>'
And user click signup button
Then user able to signup


Examples:
|FirstName|LastName|Phn Number|Passwword|Month|Day|Year|Gender|
|ABCD     |DEFG    |1234      | 566r$   |2  |2  |1999|Female  |

