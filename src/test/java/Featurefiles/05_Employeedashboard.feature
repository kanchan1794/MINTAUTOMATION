Feature: Test MintHr Employee Dashboard Functionality

  @EmployeeLogin
  Scenario: Test Login Fuctionality
    Given browser is open and user is logged in
    Then employee can see the dashboard page
