#Author
#Date
#Description
Feature: Feature to test login fuctionality

  @smokeTest
  Scenario: Check the login is successful with valid Crendentials
    Given user is on login page
    When User enters username as "ruby@mastek.com" and password as "Roobygeorge@1496"
    Then clicks on login button
    #Scenario: Check the contacts tab is opened
    #Given User is on the Salesforce home page
    Then User should click Applauncher
    And User should click Searchbox
    And User should click Contacts
    #Scenario: Check the contact was created successfully
    #Given User is on the Salesforce contact page
    When The user can able to create a contact
    And User enters Firstname as "Rooby" and lastname as "George"
    And User enters Department as "QA" and Title as "SQE"
    And The contact is created successfully
