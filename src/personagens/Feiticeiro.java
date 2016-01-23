package personagens;

public class Feiticeiro extends Personagem {
    
    private int magia;
    
    public Feiticeiro(String nome) {
        super(nome,"Feiticeiro","");
        
        ataque = 4;
        defesa = 6;
        magia = 10;
    }
    
    public int obterMagia() {
        return magia;
    }
    public void definirMagia(int magia) {
        if (magia >= 0) {
            this.magia = magia;
        }
    }
    public void definirMagia() {
        
    }
    public String toString() {
        return super.toString() + " Magia: " + magia;
    }

    @Override
    public void definirNivel(int nivel) {
        //instruções
    }
}