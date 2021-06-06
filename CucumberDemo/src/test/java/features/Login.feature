Feature: Application login

Scenario: Home page basic login
  Given User is on login page
  When user login into the website
  Then home page is populated
  And cards are displayed
