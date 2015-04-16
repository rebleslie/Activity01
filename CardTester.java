 



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
    /**
     * Default constructor for test class CardTester
     */
    public CardTester()
    {
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

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void constructorTest()
    {
        Card c = new Card("diving", "captain", 1);
    }
    
    @Test
    public void suitTest()
    {
        Card c = new Card("space", "colonel", 2);
        c.suit();
    }
    
    @Test
    public void rankTest()
    {
        Card c = new Card("swim", "general", 3);
        c.rank();
    }
    
    @Test
    public void pointValueTest()
    {
        Card c = new Card("jump", "private", 4);
        c.pointValue();
    }
}
