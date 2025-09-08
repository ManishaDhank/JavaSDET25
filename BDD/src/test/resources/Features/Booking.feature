@regression
Feature: Hotel Booking on Booking.com

  Scenario: Successful booking flow
    Given user opens booking website
    When user searches for "New Delhi" from "Th 18 September 2025" to "Fr 19 September 2025"
    And user selects a hotel
    And user selects a room
    And user fills personal details "John" "Doe" "johndoe123@gmail.com" "9784469446"
    Then user confirms the booking

