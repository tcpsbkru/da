package com.ku.da;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testConfirmations() {

        int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        App app = new App();
        boolean b = app.confirmations(anArray);
        System.out.println(b);
    }
}
