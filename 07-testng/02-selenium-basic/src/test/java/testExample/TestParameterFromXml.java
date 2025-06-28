package testExample;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterFromXml {

    @Parameters(value = {"firstName", "lastName"})
    @Test(groups = {"smoke"})
    public void testParam(String fName, String lName) {
        System.out.println("Param firstName is: " + fName + "; lastName is: " + lName);
    }
}
