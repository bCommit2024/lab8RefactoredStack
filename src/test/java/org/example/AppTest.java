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

    public void testPushPopInt(){
        MyStack<Integer> testPushPopInteger = new MyStack<Integer>();
        testPushPopInteger.push(1);
        Integer popInt = testPushPopInteger.pop();
        assertEquals(new Integer(1),popInt);
    }

    public void testIsEmptyDelegate(){
        MyStack<Integer> testIsEmpty = new MyStack<Integer>();
        assertTrue(testIsEmpty.isEmpty());
        testIsEmpty.push(1);
        assertFalse(testIsEmpty.isEmpty());
    }

    public void testSizeDelegate(){
        testPush();
        MyStack<Integer> testSize = new MyStack<Integer>();
        testSize.push(1);
        assertEquals(1,testSize.size());
        testSize.push(2);
        testSize.push(3);
        assertEquals(3,testSize.size());
    }
}
