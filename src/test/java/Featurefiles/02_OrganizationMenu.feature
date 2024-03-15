Feature: Test MintHr Organization menu Functionality

  @Organization
  Scenario: Test Organization menu Functionality
    When Superadmin click on organization menu
    Then Superadmin is able to see Add Organization and View Organization submenu

#    @AddOrganization
#    Scenario: Test Add organization functionality
#     When super admin click on Add organization menu
#     Then super admin see the details of Add organization


   @ViewOrganization
   Scenario: Test ViewOrganization submenu Functionality.
     When user click on ViewOrganization submenu then information is display
  Then User can see organization details


  #@Vieworganizationsubmenu
#  Scenario: MintHr Vieworganization Submenu List Functionality
#    When superAdmin Enters Search Keywords
#    Then Relevant Search Results Generated
#    When superAdmin click on status dropdown
#    Then dropdown list is visible and admin is able to click on dropdown option.
#    When superadmin click on view icon
#    Then superadmin can see organization details
#    When superadmin click on create admin button
#    Then superadmin can navigate to add Employee details form
#    And superadmin can add basic employee details
    #And super admin can add communication details
    #And super admin add Identity Details
    #And super admin can add Bank details
    ##And Super admin can add Job Details
    #And Super admin can add Emergency Contact details
    #And Super admin can add Assets details
    #And super admin can Salary details
    #And super admin can others details

  @Organizationstatusmenu
  Scenario: Test MintHr Organizationstatus Submenu Functionality
    When superadmin click on Organizationstatus Submenu then information is display
    Then superadmin  can see organizationstatus details
    When  superadmin click on calendar
    Then superadmin able to click on year & month
    When superadmin enter the search keyword
    Then Relevant search is generated


#  @activitiesmenu
#  Scenario: Test MintHr activities menu Functionality
#    When admin click on activities menu
#    Then Admin can see add & list activities submenu.
#
#  @activitiessubmenu
#  Scenario: Test MintHr activities Submenu Functionality
#    When admin click on Add activities submenu
#    Then relevant search is generated of submenu









