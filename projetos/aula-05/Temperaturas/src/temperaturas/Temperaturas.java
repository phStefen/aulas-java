/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturas;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double k=0,f=0,c=0;
        
        System.out.print("Sua temperatura será em:\n1. Fº\n2. Kº\n3. Cº\nOpção: ");
        int opc = new Scanner(System.in).nextInt();
        
        System.out.print("Digite sua Temperatura: ");
        double temp = new Scanner(System.in).nextDouble();
        
        switch(opc){
            case 1:
                f = temp;
                c = (f-32)/1.8;
                k = c + 273.15;
                break;
            case 2:
                k = temp;
                c = k = 273.15;
                f = (c*1.8) + 32;
                break;
            case 3:
                c = temp;
                k = c + 273.15;
                f = (c*1.8) + 32;
                break;
        }
        
        System.out.println("\nFº: " + f + "\nKº: " + k + "\nCº: " + c);
    }
    
}
