Feature: Add Items

  Scenario Outline: Add Items to Quote
    Given I open the browser with url
    Given I am on the login page
    When I enter valid credentials and click sign in "<username>", "<password>"
    Then I should see the quotes list view
    When I click on create quote button at quotes list
    Then I should see the create quote page and i fill the details as "<accountNum>", "<quoteType>", "<details>"
    When I click on the Create button
    Then I shoould see the add items button at quote details page
    When I click on Add items button
    And I search and add items
    And I close the browser

    Examples:
      | username                        |password   | accountNum|quoteType  |details                                             |       items|
      | defaultuser@enterpi.com         | Enter@4321|    ZUMMO00|Parts Quote|       Zummo Meat Co IncZUMMO003705 SAINT JAMES BLVD|GA80U4103ABM|