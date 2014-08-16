package helloworld;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import testCase.AbstractTestCase;

public class HelloTestCase extends AbstractTestCase{
  
    @BeforeClass
    public static void startupSystem() {
    	printOut("@BeforeClass - Startup at HelloTestCase class");
    }
    
    @Test
    public void testTellwithValidInput() {
        assertEquals("Hello Test !!!", Hello.tell("Test"));
        printOut("@Test - testTellwithValidInput");
    }

    @Test
    public void testTellwithInvalidInput() {
        assertEquals("Hello Anonymous !!!", Hello.tell(null));
        printOut("@Test - testTellwithInvalidInput");
    }

}
