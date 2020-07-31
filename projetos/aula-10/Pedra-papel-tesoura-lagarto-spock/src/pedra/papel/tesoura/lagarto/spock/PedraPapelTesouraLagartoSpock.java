package pedra.papel.tesoura.lagarto.spock;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class PedraPapelTesouraLagartoSpock {
    public static void main(String[] args) {
        System.out.print("Digite quantas Tentativas: ");
        int x = new Scanner(System.in).nextInt();
        
        for(int i=0;i<x;i++){
            System.out.print("\nRejesh joga: ");
            String p1 = new Scanner(System.in).next();
            
            System.out.print("Sheldon joga: ");
            String p2 = new Scanner(System.in).next();
            
            System.out.println(verificarGanhador(p1.toLowerCase(),p2.toLowerCase()));
        }
    }
    
    public static String verificarGanhador(String p1, String p2){
        switch(p1){
            case "tesoura":
                switch(p2){
                    case "papel":
                    case "lagarto":
                        return "Rejesh Ganhou!";
                    case "spock":
                    case "pedra":
                        return "Sheldon Ganhou!";
                    default:
                        return "Empate!";
                }
            case "papel":
                switch(p2){
                    case "spock":
                    case "pedra":
                        return "Rejesh Ganhou!";
                    case "tesoura":
                    case "lagarto":
                        return "Sheldon Ganhou!";
                    default:
                        return "Empate!";
                }
            case "pedra":
                switch(p2){
                    case "tesoura":
                    case "lagarto":
                        return "Rejesh Ganhou!";
                    case "papel":
                    case "spock":
                        return "Sheldon Ganhou!";
                    default:
                        return "Empate!";
                }
            case "lagarto":
                switch(p2){
                    case "spock":
                    case "papel":
                        return "Rejesh Ganhou!";
                    case "tesoura":
                    case "pedra":
                        return "Sheldon Ganhou!";
                    default:
                        return "Empate!";
                }
            case "spock":
                switch(p2){
                    case "pedra":
                    case "tesoura":
                        return "Rejesh Ganhou!";
                    case "papel":
                    case "lagarto":
                        return "Sheldon Ganhou!";
                    default:
                        return "Empate!";
                }
            default:
                return "Empate!";
        }
    }
}
