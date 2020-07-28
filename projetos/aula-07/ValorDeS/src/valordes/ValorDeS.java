/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valordes;

/**
 *
 * @author T-Gamer
 */
public class ValorDeS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s=1;
        for(double i=2;i<=100;i++){
            s+=(1/i);
        }
        System.out.println(s);
    }
    
}
