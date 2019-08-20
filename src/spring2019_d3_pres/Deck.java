/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring2019_d3_pres;
import java.util.Random;

/**
 *
 * @author jade
 */
public class Deck {
    private final Card[] deck = new Card[52];
    private final Random rndm = new Random();

    public Card[] getDeck() {
        return deck;
    }

    /**
    *
    * Creates 52 cards and adds them to deck array
    */
    public Deck() {
        int k = 0;
        for (int i = 0; i < 13; i++) {//loop over ranks i
            for (int j = 0; j < 4; j++) {//over suits j
                Card c = new Card(j,i);
                deck[k] = c;//13*4 = 52 cards k
                k++;
            }
        }
    }
    
    /**
    *
    * Randomizes the cards in the deck array
    */
    public void shuffle(){
        Card hold = null;
        
        for (int i = 0; i < 52; i++) {
            hold = deck[i];
            deck[i] = deck[rndm.nextInt(52)];
            deck[rndm.nextInt(52)] = hold;
        }
    }
}
