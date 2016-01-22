/*
 *  
 */
package corredor;

import java.util.ArrayList;

/**
 *
 * @author gm
 */
public class Corredor {
    /**
     * Indica o número de posições do corredor
     */
    private int comprimento;
    /**
     * lista com os inimigos do corredor
     */
    private ArrayList listaInimigos;
    /**
     * Indica que inimigo se encontra em cada posição
     * O índice do vetor corresponde à posição do corredor
     * O número guardado, subtraindo 1, corresponde ao índice da lista
     * de inimigos, indicando o inimigo dessa posição
     * Se tiver 0 não há inimigo nessa posição
     */
    private int[] posicoesInimigos;
    
    public Corredor(int comprimento) {
        this.comprimento = comprimento;
        listaInimigos = new ArrayList();
        posicoesInimigos = new int[comprimento];
        Inimigo ini = new Inimigo("Inimigo");
        listaInimigos.add(ini);
        posicoesInimigos[1] = 1;
    }
    public int obterComprimento() {
        return comprimento;
    }
    public boolean posTemInimigo(int pos) {
        return posicoesInimigos[pos] != 0;
    }
    
    public Inimigo obterInimigo(int pos) {
        Inimigo ini = null;
        if (posTemInimigo(pos)) {
            ini = (Inimigo) listaInimigos.get(posicoesInimigos[pos]-1);
        }
        return ini;
    }
}
