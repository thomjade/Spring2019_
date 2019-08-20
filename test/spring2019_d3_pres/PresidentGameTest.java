/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring2019_d3_pres;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jade
 */
public class PresidentGameTest {
    

    /**
     * Test of Play method, of class PresidentGame.
     */
    @Test
    public void testPlay() {
        System.out.println("Play");
        PresidentGame instance = new PresidentGame();
        boolean expResult = false;
        boolean result = instance.Play();
        assertEquals(expResult, result);
    }
    
}
