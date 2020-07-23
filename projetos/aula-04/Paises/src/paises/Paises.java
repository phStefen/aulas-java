/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite uma Letra:");
        char letra = new Scanner(System.in).next().charAt(0);
        
        switch(letra){
            case 'a':
                System.out.println("Argentina");
                break;
            case 'b':
                System.out.println("Brasil");
                break;
            case 'c':
                System.out.println("Canadá");
                break;
            case 'd':
                System.out.println("Dinamarca");
                break;
            case 'e':
                System.out.println("Egito");
                break;
            case 'f':
                System.out.println("Finlândia");
                break;
            case 'g':
                System.out.println("Grécia");
                break;
            case 'h':
                System.out.println("Haiti");
                break;
            case 'i':
                System.out.println("Itália");
                break;
            case 'j':
                System.out.println("Japão");
                break;
            case 'k':
                System.out.println("Kosovo");
                break;
            case 'l':
                System.out.println("Líbia");
                break;
            case 'm':
                System.out.println("Marrocos");
                break;
            case 'n':
                System.out.println("Noruega");
                break;
            case 'o':
                System.out.println("Omã");
                break;
            case 'p':
                System.out.println("Peru");
                break;
            case 'q':
                System.out.println("Quênia");
                break;
            case 'r':
                System.out.println("Romênia");
                break;
            case 's':
                System.out.println("Senegal");
                break;
            case 't':
                System.out.println("Turquia");
                break;
            case 'u':
                System.out.println("Ucrânia");
                break;
            case 'v':
                System.out.println("Vietnã");
                break;
            case 'w':
                System.out.println("Não Existe");
                break;
            case 'x':
                System.out.println("Não Existe");
                break;
            case 'y':
                System.out.println("Não Existe");
                break;
            case 'z':
                System.out.println("Não Existe");
                break;
            default:
                System.out.println("Valor Inválido");
                break;
        }
    }
    
}
