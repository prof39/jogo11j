/*
 *  
 */
package palavra;

/**
 *
 * @author administrador
 */
public class AdivinharPalavra {
    
    private String palavra;
    private char[] letras;
    private int contagemAdivinhadas;
    
    public AdivinharPalavra(String palavra) {
        this.palavra = palavra;
        letras = new char[palavra.length()];
        for(int i=0; i < letras.length; i++) {
            letras[i] = 'X';
        }
        contagemAdivinhadas = 0;
    }
    public String obterLetrasAdivinhadas() {
        return new String(letras);
    }
    public boolean adivinharLetra(char c) {
        boolean r = false;
        if (palavra.contains(""+c) && !jaAdivinhada(c)) {
            for (int i=0;i<palavra.length();i++) {
                if (palavra.charAt(i) == c) {
                    letras[i] = c;
                    contagemAdivinhadas++;
                }
            }
            r = true;
        }
        return r;
    }
    public boolean jaAdivinhada(char c) {
        boolean r = false;
        for(int i=0;i<letras.length;i++) {
            if (letras[i]==c) {
                r = true;
            }
        }
        return r;
    }
    public boolean adivinharPalavra(String p) {
        return p.equals(palavra);
    }
    public boolean letraExiste(char c) {
        return palavra.contains(""+c);
    }
    public boolean palavraAdivinhada() {
        return contagemAdivinhadas == letras.length;
    }
    
}
