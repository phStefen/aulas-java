package jogolabirinto;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class JogoLabirinto {
    private static final char PAREDE_VERTICALE = '[';
    private static final char PAREDE_VERTICALD = ']';
    private static final char PAREDE_HORIZONTAL = '-';
    private static final char PAREDE_INTERNA = '_';
    private static final char VAZIO = ' '; 
    private static final int TAMANHO = 15;
    private static final double PROBABILIDADE = .7;
    private static char[][] tabuleiro;
    
    public static void iniciarTabuleiro(){
        for(int i=0;i<TAMANHO;i++){
            tabuleiro[i][0] = PAREDE_VERTICALE;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICALD;
            tabuleiro[0][i] = PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
        }
        for(int i=1;i<TAMANHO-1;i++){
        for(int j=1;j<TAMANHO-1;j++){
            if(Math.random() > PROBABILIDADE) tabuleiro[i][j] = PAREDE_INTERNA;
            else tabuleiro[i][j] = VAZIO;
        }
        }
        
        tabuleiro[TAMANHO - 1][0] = PAREDE_HORIZONTAL;
    }
    
    public static void imprimir(){
        for(int i=0;i<TAMANHO;i++){
        for(int j=0;j<TAMANHO;j++){
            System.out.print(tabuleiro[i][j]);
        }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        tabuleiro = new char[TAMANHO][TAMANHO];
        iniciarTabuleiro();
        imprimir();
    }
}
