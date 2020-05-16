Feature: As a user i need to click the first result of search in youtube to find a video

  @Ignore #Test OK
  Scenario: The client open the first video
    Given The client is in the home of youtube page
    When The client go to search for automation and click the first result
    Then The client see the video selected


  @Ignore #Este test fallará, porque el resultado esperado es distinto
  Scenario: The client open the first video
    Given The client is in the home of youtube page
    When The client go to search for lippia and click the first result
    Then The client see the video selected

  @Ignore #Este test fallará, porque el resultado esperado es distinto
  Scenario: The client open the first video
    Given The client is in the home of youtube page
    When The client go to search for crowdar and click the first result
    Then The client see the video selected
