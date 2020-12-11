/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jared Boese
 */
public class TestRandom {
    
    public TestRandom() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testTotal(){
        int count = 6;
        int[] rand = new int[count];
         Randomizer unit = new Randomizer();
         int ExpResult = 75;
                 do {
            unit.randomer(rand);
        } while (rand[0] > 18 || rand[1] > 18 || rand[2] > 18 || rand[3] > 18 || rand[4] > 18 || rand[5] > 18);
      int result = IntStream.of(rand).sum();
     assertEquals(ExpResult,result);
     }
        
}
