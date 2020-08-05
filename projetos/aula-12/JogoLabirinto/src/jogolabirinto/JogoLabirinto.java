package jogolabirinto;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class JogoLabirinto {
    private static final char CAMINHO = '.';
    private static final char SEM_SAIDA = 'x';
    private static final char INICIO = 'I';
    private static final char DESTINO = 'D';
    private static final char PAREDE_VERTICAL = '|';
    private static final char PAREDE_HORIZONTAL = '-';
    private static final char PAREDE_INTERNA = '@';
    private static final char VAZIO = ' '; 
    private static final int TAMANHO = 10;
    private static final double PROBABILIDADE = .7;
    
    private static char[][] tabuleiro;
    private static int linhainicio;
    private static int colunainicio;
    
    public static void iniciarTabuleiro(){
        for(int i=0;i<TAMANHO;i++){
            tabuleiro[i][0] = PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
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
        
        linhainicio = gerarNumero(TAMANHO/2, TAMANHO-2);
        colunainicio = gerarNumero(TAMANHO/2, TAMANHO-2);
        tabuleiro[linhainicio][colunainicio] = DESTINO;
        
        linhainicio = gerarNumero(1, TAMANHO/2-1);
        colunainicio = gerarNumero(1, TAMANHO/2-1);
        tabuleiro[linhainicio][colunainicio] = INICIO;
    }
    
    public static void imprimir(){
        for(int i=0;i<TAMANHO;i++){
        for(int j=0;j<TAMANHO;j++){
            System.out.print(tabuleiro[i][j]);
        }
            System.out.println();
        }
        
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
    
    public static int gerarNumero(int min, int max){
        int valor = (int)Math.round(Math.random()*(max-min));
        return min + valor;
    }
    
    public static boolean procurarCaminho(int i, int j){
     int pi, pj;
     boolean achou = false;
     
     pi = i-1;
     pj = j;
     achou = tentarCaminho(pi,pj);
     
     if(!achou){
         pi = i+1;
         pj = j;
         achou = tentarCaminho(pi,pj);
     }
     
     if(!achou){
         pi = i;
         pj = j-1;
         achou = tentarCaminho(pi,pj);
     }
     
     if(!achou){
         pi = i;
         pj = j+1;
         achou = tentarCaminho(pi,pj);
     }
     
     return achou;
    }
    
    public static boolean tentarCaminho(int i, int j){
        boolean achou = false;
        if(tabuleiro[i][j] == DESTINO) achou = true;
        else if(posicaoVazia(i,j)){
            tabuleiro[i][j] = CAMINHO;
            imprimir();
            
            achou = procurarCaminho(i, j);
            
            if(!achou){
                tabuleiro[i][j] = SEM_SAIDA;
                imprimir();
            }
        }
            
        return achou;
    }
    
    public static boolean posicaoVazia(int i, int j){
        if(i>=0 && j>=0 && i<TAMANHO && j<TAMANHO) return tabuleiro[i][j] == VAZIO;
        return false;
    }
    
    public static void main(String[] args) {
        tabuleiro = new char[TAMANHO][TAMANHO];
        iniciarTabuleiro();
        imprimir();
        if(procurarCaminho(linhainicio, colunainicio)) System.out.println("ACHOU O CAMINHO!");
        else System.out.println("NÃO TEM CAMINHO!");
    }
}
