
Feature: SpringBoot Request

  @ReceiveCorrectResponse
  Scenario Outline: Send a valid Request to get correct response
    Given I send a request to the URL "<url>"
    Then the response will return "<response>"

    Examples:
      | url             | response                   |
      | /               | Hello World, Spring Boot!  |
      | /qaautomation   | Hello QA Automation!       |


  @ReceiveCorrectResponse1
  Scenario: Call an endpoint
    When I call the end point "https://jsonplaceholder.typicode.com/posts/1"
    Then The status should be 200


