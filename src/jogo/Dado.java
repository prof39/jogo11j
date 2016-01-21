package jogo;

public class Dado {
    
    /* 
       ao definir a variável como final 
       o valor só pode ser modificado uma vez
       deve-se fazer isso no construtor
       fica um valor constante
    */
    private final int LADOS;
    private int ultimoLado;
    
    public Dado(int l) {
        ultimoLado = 0;
        if (l<4) {
            LADOS = 4;
        }
        else {
            LADOS = l;
        }
    }
    
    public int jogar() {
        // Math.random() --> gera entre [0;1[
        // para gerar entre [A;B[ :
        // N = Math.random()
        // N * (B - A) + A
        // para gerar entre [A;B] :
        // N * (B + 1 - A) + A
        // entre [1;lados] :
        // N * (lados + 1 - 1) + 1
        // N * lados + 1
        double aleatorio = Math.random() * LADOS + 1 ;
        //se for arredondado altera a distribuição
        //deve-se truncar, o cast faz a truncatura
        int n = (int) aleatorio;
        ultimoLado = n;
        return n;
    }
    
    public int obterLados() {
        return LADOS;
    }
    public int obterUltimoLado() {
        return ultimoLado;
    }        
    public String toString() {
        return "lado: " + ultimoLado + " de " + LADOS;
    }
    
}