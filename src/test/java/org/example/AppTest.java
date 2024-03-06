package org.example;

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

    public void testPush(){
        MyStack<Object> testMyStackPush = new MyStack<Object> ();
        testMyStackPush.push(new Object());
        assertNotNull(testMyStackPush);
    }

    public void testPop(){
        testPush();
        MyStack<Object> testMyStackPop = new MyStack<Object> ();
        testMyStackPop.push(new Object());
        Object popObj = testMyStackPop.pop();
        assertNotNull(popObj);
    }
}
