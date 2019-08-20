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
public class RealPlayer extends Player {

    public RealPlayer(String type) {
        super(type);
    }

    @Override
    public Card[] play(ArrayList<Card[]> pile) {
        
        System.out.println("Your hand" + this.getHand());
        
        Card[] turnMove = new Card[1];
        
        return turnMove;
    }

}
