Feature: Test MintHr Employee Documents menu Functionality

  @Documents
  Scenario: Test Employee  Documents Menu functionality
    When employee click on Document menu
    Then employee can see the submenu

    @MyPayslip
    Scenario: Test My Payslip SubMenu functionality
      When employee click on my payslip submenu
      Then employee can see list of payslip & other document
      When employee enter the  search keywords
      Then relevant search is generated
      When employee click on PDf icon to open payslip
      Then employee can see preview dialouge box

      @MyDocument
      Scenario: Test My Document SubMenu functionality
        When employee click on my document
        Then employee can see the list of document
        When employee enter search keywords
        Then relevant search generated

        @OrganizationDocument
        Scenario: Test Organization Document SubMenu functionality
          When employee click on organization document
          Then employee can see list of view & update policy
          When employee enter keyword in search text box
          Then it generate relevant search


