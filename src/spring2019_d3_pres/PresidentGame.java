/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring2019_d3_pres;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jade
 */
public class PresidentGame {
    int NUM_OF_PLAYERS = 5;
    Player[] players = new Player[NUM_OF_PLAYERS];

    public PresidentGame() {
        Deck deck = new Deck();
        
        for (int i = 0; i < (players.length - 1); i++) {//create 4 AIplayers
            players[i] = new AIPlayer("AIPlayer" + i);
        }
        players[(players.length - 1)] = new RealPlayer("RealPlayer");
        
        ArrayList<Card> pile = new ArrayList<>();//pile the players play on
        
        deck.shuffle();
        
        int d = 0;
        while(d < 52){//deal out hand
            for (int j = 0; j < NUM_OF_PLAYERS; j++) {//add a card to each players hand
                if (d < 52) {
                    players[j].getHand().add(deck.getDeck()[d]);
                }else break;
                d++;
            }
        }
        
    }
    
    public boolean Play(){
        
        ArrayList<Card[]> pile = new ArrayList<>();
        
//        System.out.print("•	The game consists of 5 players.\n" +
//"•	The dealer shuffles the deck and deals all the cards to the players.\n" +
//"•	The scum/random player makes the first play.\n" +
//"•	Players play until they have no more cards\n" +
//"•	The first to play all their cards is ranked President, the 2nd Vice-Pres, 3rd neutral, 4thVice-scum, 5th Scum.\n" +
//"•	On each iteration of the game\n" +
//"- the President exchanges two of any card they wish with the Scum.\n" +
//"- the Scum exchanges the two highest ranked cards from their hand with the President.\n" +
//"- the Vice-President exchanges one of any card they wish with the Vice-Scum.\n" +
//"- the Vice-Scum exchanges the two highest ranked cards from their hand with the Vice-President.\n" +
//"- Neutral remains neutral\n" +
//"•	The game is scored depending on the rank of the players, and the starting total rank of the "
//                + "\nplayers hand. The lower the starting rank and hand the higher the score if a win is achieved.\n");
        
        Card[] currentMove;
        int topOfPile = (pile.size() - 1);
        int turn = (int)(Math.random()*NUM_OF_PLAYERS);//someone randomly goes first
        
        if (players[turn].getType().equals("RealPlayer") ) {//prompt for player
            System.out.printf("Play card(s) on "+ Arrays.toString(pile.get(topOfPile)));
        }
        currentMove = players[turn].play(pile);
        pile.add(currentMove);
        
        while(pile.size() < 52){ //game loop play until everybody has played their entire hand
            
            turn = turn == NUM_OF_PLAYERS ? 0 : turn;
            
            if (players[turn].getType().equals("RealPlayer") ) {//prompt for player
                System.out.printf("Play card(s) on "+ Arrays.toString(pile.get(topOfPile)));
            }
            
            currentMove = players[turn].play(pile);
            pile.add(currentMove);
            System.out.println("Number of cards played: " + pile.size() + "\n");
            for (Card currentMove1 : currentMove) {
                System.out.print("Turn: " + (turn) + "\nTop of pile: " + currentMove.length + 
                        "x " + currentMove1.getRank());
            }
            System.out.print("\n");
            turn++;
        }
        
        return false;
    }

    
}
