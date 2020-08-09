package jogodavelha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class JogoDaVelha {
    private static long inicio;
    private static int jog;
    private static int[][] casa = new int[3][3];
    private static int linha, coluna, win;
    private static Jogador[] jogadores = new Jogador[2];
    private static List<Jogador> hist = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static File ranking = new File("ranking.obj");
    
    public static void setTempo(){
        inicio = System.currentTimeMillis();
    }
    
    public static long getTempo(){
        return (System.currentTimeMillis() - inicio)/1000;
    }
    
    public static void cadastro(){
        System.out.print("Digite o Nome do Jogador 1: ");
        jogadores[0] = getJogador(scan.next());
        System.out.print("Digite o Nome do Jogador 2: ");
        jogadores[1] = getJogador(scan.next());
    }
    
    public static Jogador getJogador(String nome){
        Jogador p = new Jogador();
        
        for(Jogador j : hist){
            if(j.nome.equalsIgnoreCase(nome)) return j;
        }
        
        p.nome = nome;
        p.v = 0;
        p.d = 0;
        
        hist.add(p);
        return p;
    }
    
    public static void imprimirJogadores(){
        System.out.println("Resultado dos Jogadores: ");
        for(Jogador j : hist){
            System.out.println("Nome: " + j.nome);
            System.out.println("| Vitórias: " + j.v);
            System.out.println("| Derroas: " + j.d);
            System.out.println();
        }
    }
    
    public static void salvarJogadores(){
        try {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(ranking));
            saida.writeObject(hist);
        } catch (Exception e) {
        }
    }
    
    public static void carregarJogadores(){
        try {
            ObjectInputStream saida = new ObjectInputStream(new FileInputStream(ranking));
            hist = (ArrayList<Jogador>) saida.readObject();
        } catch (Exception e) {
        }
    }
    
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
        System.out.print(" | ");
        desenhar(2,2);
    }
    
    public static void jogar(int jogador){
        jog = jogador;
        
        linha = 0;
        coluna = 0;
        
        
        System.out.println("\n\n" + jogadores[jog-1].nome + ", é sua Vez!");
        while(linha < 1 || linha > 3){
            System.out.print("Escolha a Linha (1,2,3): ");
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
        for(int i=0;i<3;i++){
            if(casa[i][0] == casa[i][1] && casa[i][0] == casa[i][2] && casa[i][0] != 0){
                if(casa[i][0]==1) win=1;
                if(casa[i][0]==2) win=2;
            }
            
            if(casa[0][i] == casa[1][i] && casa[0][i] == casa[2][i] && casa[0][i] != 0){
                if(casa[i][0]==1) win=1;
                if(casa[i][0]==2) win=2;
            }
        }
            
        if(casa[0][0] == casa[1][1] && casa[0][0] == casa[2][2] && casa[0][0] != 0){
            if(casa[0][0]==1) win=1;
            if(casa[0][0]==2) win=2;
        }
            
        if(casa[0][2] == casa[1][1] && casa[0][2] == casa[2][0] && casa[0][2] != 0){
            if(casa[0][0]==1) win=1;
            if(casa[0][0]==2) win=2;
        }
    }
    
    public static void main(String[] args) {
        carregarJogadores();
        cadastro();
        setTempo();
        jogo();
        for(int i=0;i<9;i++){
            if(i%2==0) jogar(1);
            else jogar(2);
            jogo();
            
            check();
            if(win == 1 || win == 2) break;
        }
        
        System.out.println();
        if(win == 1 || win == 2){
            int g = 0, p=1;
            if(win==2){
                g=1;
                p=0;
            }
            
            System.out.println(jogadores[g].nome + " venceu!");
             
             jogadores[g].v++;
             jogadores[p].d++;
        }
        else System.out.println("Deu Velha!");
        System.out.println("A Partida durou: " + getTempo() + " segundos!\n");
        imprimirJogadores();
        salvarJogadores();
    }
}
