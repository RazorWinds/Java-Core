<img src="https://boolerang.co.uk/wp-content/uploads/job-manager-uploads/company_logo/2018/04/SG-Logo-Black.png" alt="Sparta Logo" width="200"/>

---
# Lab - Control Flow

## Setup
Download and unzip the starter code ControlFlow_Lab_Starter and open it in IntelliJ.

## Lab
1. Run the unit tests for `getForecast`.  They should pass.  
   Now change the `getForecast` body so that it uses the ternary operator `?` rather than an `if-else` statement. 
   
   The unit tests should still pass and the logic should be unchanged.
2. Implement the `static` method `Exercises.average` so that it returns the average of the numbers in the array `nums`.  It must pass the unit tests written for it:
  - `Exercises_Tests.average_ReturnsCorrectAverage()`
  - `Exercises_Tests.whenListIsEmpty_Average_ReturnsZero()`

3. Implement the static method `Exercises.ticketType` so that it passes the all the test cases of  `Exercises_Tests.ticketTypeTest()`

4. A University wants to you to write a `static` method called `grade` which fulfils the following criteria:

Mark      |  Return value
----------|------------------------
75 to 100 | "Pass with Distinction"
60 to 74  | "Pass with Merit"
40 to 59  | "Pass"
0 to 39   | "Fail"

Write unit tests in `Exercises_Tests` corresponding to these criteria.

Then write a `static` method in the `Exercises` class to pass the tests.  
The client has stipulated that you must use a *nested* `if` statement to create the String to be returned - see https://www.coderscampus.com/nested-if-statements/ if you're not sure what a *nested* `if` is.

5. Create and unit test a `static` method which returns the maximum number of attendees at a Scottish wedding given the current Covid alert level as shown in the table below.  Your method must use a `switch` statement.

Level | Max attendees
------|--------------
4 | 20
3 | 50
2 | 50
1 | 100
0 | 200
