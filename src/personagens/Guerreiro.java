package personagens;

public class Guerreiro extends Personagem {
    
    public Guerreiro(String nome) {
        super(nome,"Guerreiro","guerreiro.png");
        ataque = 10;
        defesa = 10;
    }

    @Override
    public void definirNivel(int nivel) {
        
    }
    
}