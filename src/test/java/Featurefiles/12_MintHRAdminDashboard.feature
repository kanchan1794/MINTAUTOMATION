Feature: Test Mint HR Admin Dashboard Functionality


  @MintAdminLogin
  Scenario: Test Login And Dashboard Fuctionality
    Given Browser is open and Admin is logged in

    When Admin Click On Settings Icon
    Then Admin Can Navigates To Settings Page
    When Admin Click On NotiFication Icon
    Then Admin Can Navigates To Notification Page
    When Admin Click On User Profile Icon
    Then Admin Can View Different Options To Manage The Profile


