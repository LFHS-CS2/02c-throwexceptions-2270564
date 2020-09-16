
/**
 * Write a description of class InsufficientFundsException2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsufficientFundsException2 extends Exception
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class InsufficientFundsException2
     */
    public InsufficientFundsException2(String e)
    {
        // initialise instance variables
        super(e);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
