@regression
Feature: Carousel tests

  Scenario: Continuous Carousel Navigation to Right
    Given user is on "Playtime Island Preview" page
    When user clicks on "right" navigation button
    Then user sees "my-collection"
    And user clicks on "right" navigation button
    Then user sees "shaun-the-sheep"

  Scenario: Continuous Carousel Navigation to Left
    Given user is on "Playtime Island Preview" page
    When user clicks on "left" navigation button
    Then user sees "theme-songs"
    And user clicks on "left" navigation button
    Then user sees "octonauts"

  @wip
  Scenario: Game Download and Menu Navigation
    Given user is on "Playtime Island Preview" page
    When user wants to interact with "vegesaurs"