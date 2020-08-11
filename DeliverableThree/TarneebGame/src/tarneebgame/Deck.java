/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarneebgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    
    public static ArrayList cardDeck(ArrayList cardDeck) {

        for (cardSuit csuit : cardSuit.values()) {
            for (cardRank crank : cardRank.values()) {
                cardDeck.add(new Card(csuit, crank));
            }
        }
        
        //shuffling 
        Collections.shuffle(cardDeck, new Random()); 
        return cardDeck;
    }
}
