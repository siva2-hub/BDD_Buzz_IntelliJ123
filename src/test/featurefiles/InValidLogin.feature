Feature: User Login

  Scenario Outline: login with in valid credentials
    Given I open the browser with url
    Given I am on the login page
    When I enter valid credentials and click sign in "<username>", "<password>"
    Then I should see the validations
    And I close the browser

    Examples:
      | username | password |
      | defaultuser@enterpi.com    | Enter@4321    |
      | defaultuser@enterpi.com    | Enter12345    |