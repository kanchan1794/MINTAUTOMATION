Feature: Test MintHr Employee Attendance menu Functionality

  @Attendance
  Scenario: Test Employee Attendnace Menu functionality

    When employee click on Attendance menu
    Then employee can see my attendance & team attendance menu

    @Myattendance
    Scenario: Test Employee MyAttendnace SubMenu functionality
      When employee click on myattendance submenu
      Then employee can see detail of Myattendance submenu
      When employee click on calendar
      #Then employee able to click on year & month
     # Reagarding search field emplpoyee is not able to search by manually need to check on this
      #When employee enter the search keyword
      #Then relevant search is generated
     When employee click on edit button
     Then emplooyee can see edit employee attendance page
      And can click on another edit button from where he  can add check out time
      When employee click on delete button
      Then Dialouge appear to delete the attendance

     #When Employee click on Add Attendance Button




