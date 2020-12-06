package kr.ac.gnu.se5.calc;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
        Calc c = new Calc();
        assertEquals(30, c.add(10,20));
    }
}
