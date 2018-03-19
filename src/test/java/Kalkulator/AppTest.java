package Kalkulator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.jupiter.api.Test
    void add() {
        //given
        //when
        double result=App.add(2,2);
        //then
        assertEquals(6, result);
    }

    @org.junit.jupiter.api.Test
    void delta() {
        //given
        //when
        //then
    }
}
