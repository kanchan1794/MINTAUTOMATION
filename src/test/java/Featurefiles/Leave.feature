Feature: Test MintHr Employee Leave menu Functionality

  @leave
  Scenario: Test Employee Leave Menu functionality
    When employee click on Leave menu
    Then employee can see submenu

    @ApplyforLeave
    Scenario: Test Employee Applyforleave submenu functionality
      When employee click on apply for leave sub menu
      Then employee can see the list of leave type
      When employee enter the keyword in search textbox
      Then relevant search result is generated
      #When employee click on apply button
      #Then employee can see apply for leave page

