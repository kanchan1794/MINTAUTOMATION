Feature: Test MintHr Practitionerpersons menu Functionality


  @Practitioner
  Scenario: Test  practitionerpersons menu Fuctionality
    When superadmin click on Practitionerpersons menu
    Then admin is able to see the relevant page.
    When Superadmin click on Add person
    Then Superadmin can add the details of practitioner persons
