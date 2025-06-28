package testExample;

import org.testng.annotations.Test;

public class TestGroups {

    // run smoke test
    // run test case lien quan toi login

    @Test(groups = {"login", "smoke"})
    public void testGroupLogin() {
        System.out.println("Login");
    }

    @Test(groups = {"login"})
    public void testGroup01_1() {
        System.out.println("Login 01_1");
    }

    @Test(groups = {"payment", "smoke"}, dependsOnGroups = {"login"})
    public void testGroupAPayment() {
        System.out.println("Payment");
    }
}
