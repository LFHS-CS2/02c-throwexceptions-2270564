import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestMain.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testWithdraw();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void testWithdraw() {

        try {
            BankAccount b1 = new BankAccount(100);
            b1.withdraw(110);
            fail("withdraw should have thrown an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // should throw this
        } catch (Exception e) {
            fail("withdraw should have thrown an IllegalArgumentException");
        }

        try {
            BankAccount b2 = new BankAccount(100);
            b2.withdraw2(110);
            fail("withdraw2 should have thrown an InsufficientFundsException");
        } catch (Exception e) {
            boolean check = e instanceof RuntimeException;
            assertTrue("InsufficientFundsException should be a subclass of RuntimeException", check);
            Class c = e.getClass();
            assertTrue("withdraw2 should throw an InsufficientFundsException", 
                c.toString().contains("InsufficientFundsException") &&
                !c.toString().contains("InsufficientFundsException2"));
        }

        try {
            BankAccount b3 = new BankAccount(100);
            b3.withdraw3(110);
            fail("withdraw3 should have thrown an InsufficientFundsException2");
        } catch (Exception e) {
            boolean check = e instanceof RuntimeException;
            assertTrue("InsufficientFundsException2 should NOT be a subclass of RuntimeException", !check);

            Class c = e.getClass();
            assertTrue("withdraw3 should throw an InsufficientFundsException2", 
                c.toString().contains("InsufficientFundsException2"));

        }
    }

}
