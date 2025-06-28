#  TestNG

Contents
- Add dependency
- Add test class
- Add test method
- Annotations
  - before
  - after
- Move test class to main
- Test Group and DependsOnGroups
- testNG.xml
  - no need to name exactly testng.xml
  - execute test from xml file
- Parameters and Data Provider
  - Parameter from testng.xml
  - Parameter from CLI
  - DataProvider
- Listener
## Exercise

1. Basic Calculator Testing
Create a simple Calculator class with basic operations (add, subtract, multiply, divide)
- Write TestNG tests for each operation.
- Create all test cases for each operation
- Implement test groups ( "add", "substract", "divide", "multiply")
- Use @Test(dependsOnGroups) to order groups to be executed (app > substract > multiply > divide)