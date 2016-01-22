/*
 
 */
package corredor;

/**
 *
 * @author gm
 */
public class Inimigo {
    private String nome;
    private int ataque;
    private int defesa;
    private String fichImagem;
    
    public Inimigo(String nome) {
        this.nome = nome;
        fichImagem = "skeleton.png";
        ataque = 1;
        defesa = 1;
    }
    public String obterNomeImagem() {
        return fichImagem;
    }
    
}
