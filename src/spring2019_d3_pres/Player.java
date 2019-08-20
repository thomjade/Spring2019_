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
public abstract class Player {

    private final ArrayList<Card> hand = new ArrayList();
    private String type;

    public Player(String type) {
        this.type = type;
    }
    
    private void arrangeHand(){
        Card hold;
        for (int i = 0; i < this.hand.size() - 1; i++) {
            if (this.hand.get(i).getRank() < this.hand.get(i + 1).getRank()) {
                hold = this.hand.get(i);
                this.hand.set(i, this.hand.get(i + 1));
                this.hand.set(i + 1, hold);
            }
        }
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    
    /**
     *
     * @param pile
     * @return
     */
    public abstract Card[] play(ArrayList<Card[]> pile);

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
