Feature: Visa Confirmation
  As a user
  I want to check visa confirmation functionality


  @sanity @smoke @regression
  Scenario: An Australian Coming To UK For Tourism.
    Given I am on homepage
    When I click on start button
    And I select a Nationality Australia
    And I click on Continue button
    And I select reason Tourism
    And I click on Continue button
    Then I should verify result You will not need a visa to come to the UK

  @smoke @regression
  Scenario:  A ChileanComing To The UK For Work And Plans On Staying For Longe rThan Six Months.
    Given I am on homepage
    When I click on start button
    And Select a Nationality Chile
    And Click on Continue button
    And Select reason Work, academic visit or business
    And Click on Continue button
    And Select intendent to stay for longer than six months
    And Click on Continue button
    And Select have planning to work for Health and care professional
    And Click on Continue button
    Then I should verify result 'You need a visa to work in health and care

  @regression
    Scenario: A Columbian National  Coming To The UK ToJ oin A Partner For A Long Stay They Do Have An
    Given I am on homepage
    When I click on start button
    And Select a Nationality Columbia
    And Click on Continue button
    And I Select reason Join partner or family for a long stay
    And  Click on Continue button
    And I verify result You’ll need a visa to join your family or partner in the UK

