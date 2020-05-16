Feature: As a user i need to click the trending section of youtube to see some videos

  @Smoke #Test OK
  Scenario Outline: The client open the trending section of youtube and select one video
    Given The client is in the home of youtube page
    When The client click the trending section
    And  The client open the <numberOfVideo> video on trending list
    Then The client see the video

    Examples:
    |numberOfVideo|
    |1            |
    |2            |
    |3            |






