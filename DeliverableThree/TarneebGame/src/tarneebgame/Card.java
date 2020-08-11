package tarneebgame;

/**
 *
 * @author Anshul Marwaha
 * @modified by Harmandeep Kaur
 * @modified by Dupinder Kaur
 */
class Card {
    private final cardRank crank; 
    private final cardSuit csuit; 

    //constructor
    public Card(cardSuit csuit, cardRank crank) {
        this.crank = crank;
        this.csuit = csuit;
    }//end construcor

    public String getSuit() {
        return csuit.printcSuit();
    }

    public int getcRank() {
        return crank.getcRank();
    }

    // tostring method
    @Override
    public String toString() {
        StringBuilder displayCard = new StringBuilder();

        displayCard.append(crank.printcRank()).append(" - ").append(csuit.printcSuit());

        return displayCard.toString();
    }

}