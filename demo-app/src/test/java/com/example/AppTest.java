package com.example;


import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void testSum() {
      int result = App.sum(2, 3);
      assertEquals(5, result);
    }
}
