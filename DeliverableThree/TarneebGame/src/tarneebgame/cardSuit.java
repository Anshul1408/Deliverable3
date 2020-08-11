/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarneebgame;

/**
 *
 * @author Anshul Marwaha
 * @modified by Dupinder Kaur
 * @modified by Inderpreet Ghataure
 */

    public enum cardSuit {
       SPADES("Spades"), CLUBS("Clubs"), HEARTS("Hearts"), DIAMONDS("Diamonds"),;

    private final String suitval;

   public String printcSuit() {
        return suitval;
    }


    private cardSuit(String suitval) {
        this.suitval = suitval;
    }
    }
    
   



