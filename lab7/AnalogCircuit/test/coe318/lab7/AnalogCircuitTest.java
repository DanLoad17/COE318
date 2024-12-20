/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zelen
 */
public class AnalogCircuitTest {
    
    public AnalogCircuitTest() {
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
     * Test of getInstance method, of class AnalogCircuit.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        AnalogCircuit expResult = null;
        AnalogCircuit result = AnalogCircuit.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AnalogCircuit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Resistor r = null;
        AnalogCircuit instance = null;
        instance.add(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVoltage method, of class AnalogCircuit.
     */
    @Test
    public void testAddVoltage() {
        System.out.println("addVoltage");
        Voltage v = null;
        AnalogCircuit instance = null;
        instance.addVoltage(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AnalogCircuit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnalogCircuit instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
