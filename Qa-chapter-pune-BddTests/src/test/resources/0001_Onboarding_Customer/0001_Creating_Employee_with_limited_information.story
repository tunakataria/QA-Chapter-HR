Meta:

Narrative:
As an admin
I want to add a new employee with inital set of information
So that I could start the onboaring process for the new employee

Scenario: 001 Admin should be able to add new employee with initial and limited set of infromation.
Given An admin exists and has rights to add a user
When an admin adds a new employee with inital set of infromation
Then an employee should be added to the system sucessfully

Scenario: 002 Admin should not be able to add new employee with insufficient set of infromation.
Given : An admin exists and has rights to add a user
When : An admin adds a new employee with insufficient set of infromation
Then : Admin should get error message for mandatory information.

Scenario : 003 Admin should not be able to add new employee with invalid set of infromation.
Given : An admin exists and has rights to add a user
When : An admin adds a new employee with invalid set of infromation
Then : Admin should get error message for invalid information.