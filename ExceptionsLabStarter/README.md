<img src="https://boolerang.co.uk/wp-content/uploads/job-manager-uploads/company_logo/2018/04/SG-Logo-Black.png" alt="Sparta Logo" width="200"/>

---

# Exceptions Lab

&nbsp;

## Part 1 - Handling a Checked Exception

(10 mins)

Download and unzip the *ExceptionsLabStarter* code.

&nbsp;

The `CurlingSquad` class models a squad for the winter sport Curling -
each squad has a maximum of 5 members.

Currently the `addCurlers` method has an error -
it does not handle the `Exception` that could be thrown by `addCurler`.

Modify `addCurlers` so that it handles this exception
and passes the two tests in `CurlingSquadTests`

- `testAddSomeCurlers`
- `testAddTooManyCurlers`

 Do not make any other changes to the `CurlingSquad` and `CurlingSquadTests` classes.

&nbsp;  
&nbsp;

## Part 2 - Testing Exceptions

Write a unit test to verify that the `addCurler` method throws an `Exception` object with the message "Squad is full".
