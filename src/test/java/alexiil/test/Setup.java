package alexiil.test;

import org.junit.*;

public class Setup {
    public static boolean flag = false;    

    @BeforeClass
    public static void someInit() {
        System.out.println("Running Setup.someInit()");
        flag = true;
    }
}
