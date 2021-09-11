Feature: Searching flight on makemytrip

Scenario: Successfully searching for flight

Given navigate to the makemytrip website
And select source location
And select destination location
And select date and month
When select number of travellers
Then click on submit
