package tarneebgame;


import java.util.ArrayList;       
import java.util.LinkedList;    
import java.util.Scanner;

/**
 *
 * @author Dupinder Kaur
 * @modified by Harmandeep Kaur
 * @modified by Inderpreet Ghataure
 */

public class TarneebGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String name;
        String play;
        

        boolean letsplay = true;

        while (letsplay == true) {
            System.out.println("Enter your name ");
            name = input.nextLine();

            Player realplayer = new Player(name);
            
            Player virtualplayer1 = new Player("Machine1");
            Player virtualplayer2 = new Player("Machine2");
            Player virtualplayer3 = new Player("Machine3");

            TarneebPlayer player1 = new TarneebPlayer(realplayer, 0);
            TarneebPlayer player2 = new TarneebPlayer(virtualplayer1, 0);
            TarneebPlayer player3 = new TarneebPlayer(virtualplayer2, 0);
            TarneebPlayer player4 = new TarneebPlayer(virtualplayer3, 0);

            ArrayList<Card> cardDeck = new ArrayList<>();
            Deck.cardDeck(cardDeck);

            
            LinkedList<Card> dPlayer1 = new LinkedList<>();
            LinkedList<Card> dPlayer2 = new LinkedList<>();
            LinkedList<Card> dPlayer3 = new LinkedList<>();
            LinkedList<Card> dPlayer4 = new LinkedList<>();
            
            dPlayer1.addAll(cardDeck.subList(0, 13));
            dPlayer4.addAll(cardDeck.subList(13, 26));
            dPlayer3.addAll(cardDeck.subList(26, 39));
            dPlayer2.addAll(cardDeck.subList(39, cardDeck.size()));           
            

            
           TarneebLogic.TarneebLogic(dPlayer1, dPlayer2, dPlayer3, dPlayer4,
                    player1, player2, player3, player4);
            
            // For platying again
            System.out.println("Would you like to play again?press y for yes and n for no");

            while (true) {
                play = input.next();
                if (play.equals("y")) {
                    if (play.equals("n")) {
                        letsplay = false;
                    }
                    break;
                }
            }
        }
    }
}
        
    
