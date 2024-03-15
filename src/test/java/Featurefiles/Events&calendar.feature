Feature: Test MintHr Employee Events & Calendar menu Functionality

  @Events&calendar
  Scenario: Test Employee  Events & Calendar Menu functionality

    When employee click on Event & Calendar menu
    Then employee can see the details of holiday & events
    When employee click on navigation arrow to change next month
    Then employee can click on another navigation arrow to change next year
