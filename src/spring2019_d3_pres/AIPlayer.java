/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring2019_d3_pres;

import java.util.ArrayList;

/**
 *
 * @author jade
 */
public class AIPlayer extends Player {

    public AIPlayer(String type) {
        super(type);
    }
    
    private Card[] firstTurn(){
        Card[] turnMove;
                
        int[] counter = new int[this.getHand().size()];
            for (int i = 0; i < this.getHand().size()/2; i++) {//only search through lower half of arranged hand
                if (this.getHand().get(i).getRank() == this.getHand().get(i + 1).getRank()) {
                    counter[i]++;
                }
            }
            
            int most = 0;//the card with the most occurences
            for (int i = 0; i < this.getHand().size() - 1; i++) {
                if (counter[i] > counter[i+1]) {
                    most = counter[i];
                }
            }
            
            turnMove = new Card[most];
            
            for (int i = 0; i < most; i++) {
                turnMove[i] = this.getHand().get(i);
                this.getHand().remove(i);
                //System.out.println("AI plays: " + turnMove[i]);
            }
            return turnMove;
    }
//    private Card[] subsTurn(ArrayList<Card[]> pile){
//        Card[] topOfPile = pile.get(pile.size() - 1);
//        
//        for (int i = 0; i < this.getHand().size(); i++) {
//            if (this.getHand().get(i)) {
//                
//            }
//        }
//    }

    @Override
    public Card[] play(ArrayList<Card[]> pile) {
        
        
        if (pile.isEmpty()) {//if it is the first turn play the most low cards possible
            return firstTurn();
        }
        else{
            Card[] turnMove = new Card[1];
            turnMove[0] = super.getHand().get(0);
            for (int i = 0; i < (turnMove.length - 1); i++) {
                turnMove[i] = this.getHand().get(i);
                //System.out.println("AI plays: " + turnMove[i]);
            }
            return turnMove;
        }
        //return turnMove;
    }

}
