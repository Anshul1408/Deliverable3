/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarneebgame;

/**
 *
 * @author Anshul Marwaha
 * @modified by Harmandeep Kaur
 * @modified by Dupinder Kaur
 */


   public enum cardRank {    ACE(1, "Ace"), TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"),
                         SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"), TEN(10, "10"),
                         JACK(11, "Jack"), QUEEN(13, "Queen"), KING(14, "King");
    

    private final int rankNum;
    private final String rankName;

    private cardRank(int rankNum, String rankName) {
        this.rankNum = rankNum;
        this.rankName = rankName;
    }
   
    
    //getter
 public int getcRank() {
        return rankNum;
    }

    /**
     * 
     * @return string value of the card like: Queen instead of 13
     */
    
    public String printcRank() {
        return rankName;
    }
}
  