Feature: As a user i need to search in youtube to find a video

  @Smoke
  Scenario Outline: The client search a video
    Given The client is in youtube page
    When The client search for <video>
    Then The client verify that results are shown properly
    Examples:
      |video|
      |java |
      |lippia|
      |automation|
