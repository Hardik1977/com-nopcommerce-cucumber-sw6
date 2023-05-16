Feature: Top menu tabs functionality
  As a user I want to check page navigation of all top menu tabs

  @sanity @regression
  Scenario: Verify text of Computers top menu page successfully
    Given   I am on home page
    When    I select top menu as "Computers"
    Then    I verify the expected title on Computers page as "Computers"

  @smoke @regression
  Scenario: Verify text of Electronics top menu page successfully
    Given   I am on home page
    When    I select top menu as "Electronics"
    Then    I verify the expected title on Electronics page as "Electronics"

  @regression
  Scenario: Verify text of Apparel top menu page successfully
    Given   I am on home page
    When    I select top menu as "Apparel"
    Then    I verify the expected title on Apparel page as "Apparel"

  @regression
  Scenario: Verify text of Computers top menu page successfully
    Given   I am on home page
    When    I select top menu as "Computers"
    Then    I verify the expected title on Computers page as "Computers"

  @regression
  Scenario: Verify text of Digital downloads top menu page successfully
    Given   I am on home page
    When    I select top menu as "Digital downloads"
    Then    I verify the expected title on Digital downloads page as "Digital downloads"

  @regression
  Scenario: Verify text of Computers top menu page successfully
    Given   I am on home page
    When    I select top menu as "Books"
    Then    I verify the expected title on Books page as "Books"

  @regression
  Scenario: Verify text of Computers top menu page successfully
    Given   I am on home page
    When    I select top menu as "Jewelry"
    Then    I verify the expected title on Jewelry page as "Jewelry"

  @regression
  Scenario: Verify text of Computers top menu page successfully
    Given   I am on home page
    When    I select top menu as "Gift cards"
    Then    I verify the expected title on Gift cards page as "Gift Cards"
