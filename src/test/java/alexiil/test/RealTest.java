package alexiil.test;

import org.junit.*;

public class RealTest extends Setup {
    @Test
    public void test() {
        System.out.println("Running RealTest.test()");
        Assert.assertTrue("The flag was not true! What?", Setup.flag);
    }
}
