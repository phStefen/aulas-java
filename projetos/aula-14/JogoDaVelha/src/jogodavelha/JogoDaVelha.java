package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class JogoDaVelha {
    private static int jog;
    private static int[][] casa = new int[3][3];
    private static int linha, coluna, win;
    private static Scanner scan = new Scanner(System.in);
    
    public static void desenhar(int x, int y){
        if(casa[x][y] == 1) System.out.print("X");
        else if(casa[x][y] == 2) System.out.print("O");
        else System.out.print(" ");
    }
    
    public static void jogo() {
        System.out.print("\n  1   2   3\n"); 
        System.out.print("1 ");
        desenhar(0,0);
        System.out.print(" | ");
        desenhar(0,1);
        System.out.print(" | ");
        desenhar(0,2);
        System.out.print("\n -----------\n2 ");
        desenhar(1,0);
        System.out.print(" | ");
        desenhar(1,1);
        System.out.print(" | ");
        desenhar(1,2);
        System.out.print("\n -----------\n3 ");
        desenhar(2,0);
        System.out.print(" | ");
        desenhar(2,1);
        System.out.println(" | ");
        desenhar(2,2);
    }
    
    public static void jogar(int jogador){
        if(jogador == 1) jog = 1;
        else jog = 2;
        
        linha = 0;
        coluna = 0;
        
        
        System.out.println("Vez do Jogador: " + jog);
        while(linha < 1 || linha > 3){
            System.out.print("\nEscolha a Linha (1,2,3): ");
            linha = scan.nextInt();
            
            if(linha < 1 || linha > 3) System.out.println("Linha Inválida!");
        }
        
        while(coluna < 1 || coluna > 3){
            System.out.print("Escolha a Coluna (1,2,3): ");
            coluna = scan.nextInt();
            
            if(coluna < 1 || coluna > 3) System.out.println("Coluna Inválida!");
        }
        
        linha--;
        coluna--;
        
        if(casa[linha][coluna] == 0) casa[linha][coluna] = jog;
        else{
            System.out.println("Posição Ocupada!");
            jogar(jogador);
        }
    }
    
    public static void check(){
        
    }
    
    public static void main(String[] args) {
        jogo();
        jogar(1);
    }
}
