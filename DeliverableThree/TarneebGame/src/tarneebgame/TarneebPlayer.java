package tarneebgame;

/**
 *
 * @author Dupinder Kaur
 * @modified by Harmandeep Kaur
 * @modified by Inderpreet Ghataure
 */

public class TarneebPlayer {

    private Player pName;
    private int score;

    public TarneebPlayer(Player pName, int score) {
        this.pName = pName;
        this.score = score;
    }
  // getters and setters
    public Player getPlayerName() {
        return pName;
    }

    public void setPlayerName(Player pName) {
        this.pName = pName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return pName + "has score: " + score;
    }

}
