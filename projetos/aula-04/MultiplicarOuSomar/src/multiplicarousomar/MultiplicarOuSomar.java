/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicarousomar;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class MultiplicarOuSomar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1=0,n2=0;
        
        System.out.println(":: CALCULADORA ::\n\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\nOpção:");
        int opc = new Scanner(System.in).nextInt(); 
        
        System.out.println("\nInsira o 1º Valor:");
        n1=new Scanner(System.in).nextDouble();
        
        System.out.println("Insira o 2º Valor:");
        n2=new Scanner(System.in).nextDouble();
        
        switch(opc){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + somar(n1,n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + subtrair(n1,n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + multiplicar(n1,n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + dividir(n1,n2));
                break;
            default:
                break;
        }
    }
    
    public static double somar(double n1, double n2){return n1+n2;}
    public static double subtrair(double n1, double n2){return n1-n2;}
    public static double multiplicar(double n1, double n2){return n1*n2;}
    public static double dividir(double n1, double n2){return n1/n2;}
}
