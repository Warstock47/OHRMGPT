Feature: OrangeHRM authentication
  @smoke
  Scenario: Invalid credentials do not open the dashboard
    Given the user opens the OrangeHRM login page
    When the user submits invalid login credentials
    Then the dashboard should not be displayed
