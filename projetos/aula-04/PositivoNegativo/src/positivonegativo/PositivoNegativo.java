/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivonegativo;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insira um Número:");
        int num = new Scanner(System.in).nextInt();
        
        if(num<0) System.out.println(num*num);
        else System.out.println(num*2);
    }
    
}
