Meta: @notImplemented

Narrative:
As a Admin
I want to provided user credentials on employee email
So that I could start the onboaring process for the new employee

Scenario: 001 Admin provided user credentials on employee email
Given : An admin exists and has rights to add a user
When Employee is on boarded
Then admin provide user credentials on given email.

Scenario: 002 Admin is unable to provide user credential because of invalid email
Given Employee is on boarded
When  admin provide user credentials on given email.
Then admin receive an error msg .