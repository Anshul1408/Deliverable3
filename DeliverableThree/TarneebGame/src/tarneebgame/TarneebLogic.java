/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarneebgame;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Anshul Marwaha
 * @modified by Harmandeep Kaur
 * @modified by Dupinder Kaur
 */
class TarneebLogic extends TarneebGame{

    public static void TarneebLogic(LinkedList<Card> dPlayer1, LinkedList<Card> dPlayer2, LinkedList<Card> dPlayer3, LinkedList<Card> dPlayer4,
            TarneebPlayer player1, TarneebPlayer player2, TarneebPlayer player3, TarneebPlayer player4) {

        int realPlayer = 0;
        int VirtualPlayer1 = 0;
        int VirtualPlayer2 = 0;
        int VirtualPlayer3 = 0;
        boolean win = false;

        while (win == false) {

            Card p1Card = dPlayer1.pop();
            Card p2Card = dPlayer2.pop();
            Card p3Card = dPlayer3.pop();
            Card p4Card = dPlayer4.pop();

            System.out.println("Card with Player 1 is " + p1Card.toString());
            System.out.println("Card with Player 2 is " + p2Card.toString());
            System.out.println("Card with Player 3 is " + p3Card.toString());
            System.out.println("Card with Player 4 is " + p4Card.toString());

            if (p1Card.getcRank() > p2Card.getcRank() || p1Card.getcRank() > p3Card.getcRank() || p1Card.getcRank() > p4Card.getcRank()) {
                dPlayer1.addLast(p1Card);
                dPlayer1.addLast(p2Card);
                dPlayer1.addLast(p3Card);
                dPlayer1.addLast(p4Card);

                System.out.println("Number of cards with Player 1 are: ");
                realPlayer++;
            } else if (p2Card.getcRank() < p1Card.getcRank() || p2Card.getcRank() < p3Card.getcRank() || p2Card.getcRank() < p4Card.getcRank()) {
                dPlayer2.addLast(p1Card);
                dPlayer2.addLast(p2Card);
                dPlayer2.addLast(p3Card);
                dPlayer2.addLast(p4Card);

                System.out.println("Number of cards with Player 2 are: ");
                VirtualPlayer1++;
            } 
            else if (p3Card.getcRank() < p1Card.getcRank() || p3Card.getcRank() < p2Card.getcRank() || p3Card.getcRank() < p4Card.getcRank()) {
                dPlayer3.addLast(p1Card);
                dPlayer3.addLast(p2Card);
                dPlayer3.addLast(p3Card);
                dPlayer3.addLast(p4Card);

                System.out.println("Number of cards with Player 3 are: ");
                VirtualPlayer2++;
            }
            else if (p4Card.getcRank() < p1Card.getcRank()|| p4Card.getcRank() < p2Card.getcRank() || p4Card.getcRank() < p3Card.getcRank()) {
                dPlayer4.addLast(p1Card);
                dPlayer4.addLast(p2Card);
                dPlayer4.addLast(p3Card);
                dPlayer4.addLast(p4Card);

                System.out.println("Number of cards with Player 4 are: ");
                VirtualPlayer3++;
            }
            else { 
                System.out.println("There is a tie");

                
                ArrayList<Card> Wild1 = new ArrayList<>();
                ArrayList<Card> Wild2 = new ArrayList<>();
                ArrayList<Card> Wild3 = new ArrayList<>();
                ArrayList<Card> Wild4 = new ArrayList<>();

                for (int n = 0; n < 5; n++) {

                    if (dPlayer1.isEmpty() || dPlayer2.isEmpty() || dPlayer3.isEmpty() || dPlayer4.isEmpty()) {
                        break;
                    }

                    System.out.println("Wild cards");

                    Wild1.add(dPlayer1.pop());
                    Wild2.add(dPlayer2.pop());
                    Wild3.add(dPlayer3.pop());
                    Wild4.add(dPlayer4.pop());
                }

                if (Wild1.size() == 5 && Wild2.size() == 5) {

                    System.out.println("Wild card of player-1 is " + Wild1.get(0).toString());
                    System.out.println("Wild card of player-2 is " + Wild2.get(0).toString());
                    System.out.println("Wild card of player-3 is " + Wild3.get(0).toString());
                    System.out.println("Wild card of player-4 is " + Wild4.get(0).toString());

                    if (Wild1.get(4).getcRank() > Wild2.get(4).getcRank()
                            || Wild1.get(4).getcRank() > Wild3.get(4).getcRank()
                            || Wild1.get(4).getcRank() > Wild4.get(4).getcRank()) {
                        dPlayer1.addAll(Wild1);
                        dPlayer1.addAll(Wild2);
                        dPlayer1.addAll(Wild3);
                        dPlayer1.addAll(Wild4);
                        System.out.println("Player 1 is having wild cards");
                        realPlayer++;
                    } else if (Wild2.get(4).getcRank() > Wild1.get(4).getcRank()
                            || Wild2.get(4).getcRank() > Wild3.get(4).getcRank()
                            || Wild2.get(4).getcRank() > Wild4.get(4).getcRank()) {
                        dPlayer2.addAll(Wild1);
                        dPlayer2.addAll(Wild2);
                        dPlayer2.addAll(Wild3);
                        dPlayer2.addAll(Wild4);
                        System.out.println("Player 2 is having wild cards");
                        VirtualPlayer1++;
                    } else if (Wild3.get(4).getcRank() > Wild1.get(4).getcRank()
                            || Wild3.get(4).getcRank() > Wild2.get(4).getcRank()
                            || Wild3.get(4).getcRank() > Wild4.get(4).getcRank()) {
                        dPlayer3.addAll(Wild1);
                        dPlayer3.addAll(Wild2);
                        dPlayer3.addAll(Wild3);
                        dPlayer3.addAll(Wild4);
                        System.out.println("Player 3 is having wild cards");
                        VirtualPlayer2++;
                    } else {
                        dPlayer4.addAll(Wild1);
                        dPlayer4.addAll(Wild2);
                        dPlayer4.addAll(Wild3);
                        dPlayer4.addAll(Wild4);
                        System.out.println("Player 4 is having wild cards");
                        VirtualPlayer3++;
                    }
                }

            }

            player1.setScore(realPlayer);
            player2.setScore(VirtualPlayer1);
            player3.setScore(VirtualPlayer2);
            player4.setScore(VirtualPlayer3);

            
            win = Winner.winner(dPlayer1, dPlayer2, dPlayer3, dPlayer4, player1, player2, player3, player4);

        } 

    }

    private static class Winner {

        private static boolean winner(LinkedList<Card> dPlayer1, LinkedList<Card> dPlayer2, LinkedList<Card> dPlayer3, LinkedList<Card> dPlayer4, TarneebPlayer player1, TarneebPlayer player2, TarneebPlayer player3, TarneebPlayer player4) {
            if (dPlayer1.isEmpty()) {
                System.out.println("Tarneeb is won by player 1\n" + player1.toString());
                return true;
            } else if (dPlayer2.isEmpty()) {
                System.out.println("Tarneeb is won by player 2\n" + player2.toString());

                return true;
            } else if (dPlayer3.isEmpty()) {
                System.out.println("tarneeb is won by player 3\n" + player3.toString());

            } else if (dPlayer4.isEmpty()) {
                System.out.println("tarneeb is won by player 4\n" + player4.toString());

                return true;
            }
            return false;
        }
    }
}