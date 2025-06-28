package testExample;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Calculator;

public class TestCalculator {
    @Test(groups = {"add"})
    public void testAddHappyCase() {
        System.out.println("add");
        Assert.assertEquals(Calculator.add(2, 3), 5);
        Assert.assertEquals(Calculator.add(-1, -1), -2);
    }

    @Test(groups = {"add"})
    public void testAddEdgeCases() {
        System.out.println("add");
        Assert.assertEquals(Calculator.add(0, 3), 3);
        Assert.assertEquals(Calculator.add(2, 0), 2);
    }

    @Test(groups = {"divide"}, dependsOnGroups = {"substract"})
    public void testDivide() {
        System.out.println("divide");
        Assert.assertEquals(Calculator.divide(2, 3), 0);
        Assert.assertEquals(Calculator.divide(-1, -1), 1);
    }

    @Test(groups = {"substract"}, dependsOnGroups = {"add"})
    public void testSubstract() {
        System.out.println("substract");
        Assert.assertEquals(Calculator.substract(2, 3), -1);
        Assert.assertEquals(Calculator.substract(-1, -1), 0);
    }

    @Test(groups = {"multiply"}, dependsOnGroups = {"divide"})
    public void testMultiply() {
        System.out.println("multiply");
        Assert.assertEquals(Calculator.multiply(2, 3), 6);
        Assert.assertEquals(Calculator.multiply(-1, -1), 1);
    }
}
