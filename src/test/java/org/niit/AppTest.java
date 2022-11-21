package org.niit;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    Calculator obj = new Calculator();
    @Test
    public void testsum(){
        assertEquals(25,obj.add(10,15));
    }

    public void testsubtract(){
        assertEquals(10.0,obj.subtraction(50.0,40.0));
    }
    public void  testmultiply(){
        assertEquals(125.0,obj.multiplication(5.0,5.0,5.0));
    }
    public void testdivide(){
        assertEquals(7.5,obj.divide(15,2));
    }
}
