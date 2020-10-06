Feature: Upload of Single expense receipt

Background:

  Given launched url "https://testing.archarena.com/ExpenseManagement/Login.aspx?rst=true"
  When the user clicks on add symbol button on the expense list
  Then the user fills in the Fields like expense name and amount in expense upload page "Hotelexpense" "200"
  And the user Selects the particular receipt to upload

  Scenario: Selecting single expense receipt

  Scenario: upload of Single expense using browse option
  
  And the user selects browse option to upload expense receipt
  And  user clicks on okay button, expenses details must be updated and the New expenses must be displayed.