Feature: Login Page

  @smoke
  Scenario: New Tour Demo Login
    Given user open the page
    When user insert username
    Then user insert password
    Then user click login button
    Then user select the passenger count
    Then user select departure
    Then user select the destination
    Then user select the airline
    Then user click find flight button
    Then user click reserve flight button
    Then user insert first passenger first name
    Then user insert first passenger last name
    Then user insert second passenger first name
    Then user insert second passenger last name
    Then user select the credit card type
    Then user insert the credit card number
    Then user select the credeit card expiration month
    Then user select the credeit card expiration year
    Then user click buy flight button
    Then user close the browser
