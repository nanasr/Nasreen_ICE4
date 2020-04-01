/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nasre
 */
public class Ice4Test {
    
    public Ice4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Ice4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ice4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of first method, of class Ice4.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        int expResult = 0;
        int result = Ice4.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Second method, of class Ice4.
     */
    @Test
    public void testSecond() {
        System.out.println("Second");
        String expResult = "";
        String result = Ice4.Second();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Third method, of class Ice4.
     */
    @Test
    public void testThird() {
        System.out.println("Third");
        Boolean expResult = null;
        Boolean result = Ice4.Third();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
