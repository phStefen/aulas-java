/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeemdias;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class IdadeEmDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anos=0,mes=0,dias=0;
        System.out.print("Insira o Número de Dias: ");
        dias = new Scanner(System.in).nextInt();
        
        if(dias>365){
            anos = dias/365;
            dias-=365*anos;
        }
        
        if(dias>=30){
            mes = dias/30;
            dias-=30*mes;
        }
        
        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mês(es)");
        System.out.println(dias + " dia(s)");
    }
    
}
