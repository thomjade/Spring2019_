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
public class DeckTest {
   

    /**
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Deck instance = new Deck();
//        for (int i = 0; i < 52; i++) {
//            System.out.println(instance.getDeck()[i]);
//        }
        Card[] expResult = instance.getDeck();
        Card[] result = instance.getDeck();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        Card[] old = instance.getDeck();
        instance.shuffle();
        assertArrayEquals(old,instance.getDeck());
//        for (int j = 0; j < 52; j++) {
//            System.out.println(instance.getDeck()[j]);
//        }
    }

    
}
