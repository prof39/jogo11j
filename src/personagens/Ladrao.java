package personagens;

public class Ladrao extends Personagem {
    
    private int destreza;
    
    public Ladrao(String nome) {
        super(nome,"Ladrão","");
        ataque = 8;
        defesa = 6;
        destreza = 8;
    }
    public int obterDestreza() {
        return destreza;
    }
    public void definirDestreza(int destreza) {
        if (destreza >= 0) {
            this.destreza = destreza;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " Destreza: "+ destreza;
    }

    @Override
    public void definirNivel(int nivel) {
        
    }
    
}