Feature: Test MintHr Activitiesmenu Functionality

  @activities
  Scenario: Test Activitiesmenu Fuctionality

  When admin click on activitiesmenu
 Then admin can see Add & List activites submenu

    @AddActivities
    Scenario: Test Add Activities Submenu Functionality
      When admin click on Add Activites submenu
      Then admin can see the details of Add Activties

