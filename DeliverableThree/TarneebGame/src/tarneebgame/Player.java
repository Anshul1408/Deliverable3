/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarneebgame;

/*
 * @author Anshul Marwaha
 * @modified by Harmandeep Kaur
 * @modified by Inderpreet Ghataure
 */
public class Player {

    private final String Pname;

    public Player(String Pname) {
        this.Plyname = Pname;
    }
    
    
    //getter 
    public String getName() {
        return Pname;
    }

    @Override  //to string method
    public String toString() {
        return Pname;
    }

}
