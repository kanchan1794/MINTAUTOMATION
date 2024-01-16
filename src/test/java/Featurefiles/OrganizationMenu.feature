Feature: Test MintHr Organization menu Functionality

  @Organization
  Scenario: Test Organization menu Functionality
    When Superadmin click on organization menu
    Then Superadmin is able to see View and Add Organization submenu

   #@ViewOrganization
   #Scenario: Test ViewOrganization submenu Functionality.
     #When user click on ViewOrganization submenu then information is display.

  @Vieworganizationsubmenu
  Scenario: MintHr Vieworganization Submenu List Functionality
    When SuperAdmin clicks on Vieworganization submenu
    Then superAdmin  see The details of oragnization
    When superAdmin Enters Search Keywords
    Then Relevant Search Results Generated
    When superAdmin click on status dropdown
    Then dropdown list is visible and admin is able to click on dropdown option.
    When superadmin click on view icon
    Then superadmin can see organization details
    When superadmin click on create admin button
    Then superadmin can navigate to add Employee details form
    And superadmin can add basic employee details
    And super admin can add communication details
    And super admin add Identity Details
    And super admin can add Bank details
    And Super admin can add Job Details
    And Super admin can add Emergency Contact details
    And Super admin can add Assets details
    And super admin can Salary details
    And super admin can others details







