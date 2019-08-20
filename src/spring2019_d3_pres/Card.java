/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring2019_d3_pres;

/**
 *
 * @author jade
 */
public class Card {
    private final String[] suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
    private final int[] ranks = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
    private String suit;
    private int rank;

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setSuit(int i) {
        this.suit = suits[i];
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
   
    public Card(){
    }
    
    public Card(int suit, int rank){
        this.suit = suits[suit];
        this.rank = ranks[rank];
    }
    
    @Override
    public String toString(){
        return this.rank + " of " + this.suit;
    }
}
