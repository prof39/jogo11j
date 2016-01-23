package personagens;


public abstract class Personagem {
    protected String nome;
    protected final String CLASSE;
    protected int vida;
    protected int nivel;
    protected int ataque;
    protected int defesa;
    private static int numeroPersonagens;
    protected String fichImagem;

    public Personagem(String nome, String classe, String imagem) {
        numeroPersonagens++;
        this.vida = 10;
        this.nivel = 1;
        this.nome = nome;
        this.CLASSE = classe;
        fichImagem = imagem;
    }

    public void definirVida(int vida) {
        this.vida = vida;
    }
    
    public abstract void definirNivel(int nivel);
  
    public final void definirAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public void definirDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int obterVida() {
        return vida;
    }

    public int obterNivel() {
        return nivel;
    }

    public int obterAtaque() {
        return ataque;
    }

    public int obterDefesa() {
        return defesa;
    }
    
    public String obterFichImagem() {
        return fichImagem;
    }

    public final static int obterNumeroPersonagens() {
        return numeroPersonagens;
    }

    public boolean ataqueMaior(Personagem p) {     
        return (ataque > p.ataque);
    }

    @Override
    public String toString() {
        return "Personagem: " + nome + ", " + CLASSE + " Nível: " + nivel + 
                    " – A/D: " + ataque + "/" + defesa + " – V: " + vida + "";
    }
    
    public static Personagem criarPersonagem(String classe, String nome) throws IllegalArgumentException {
        Personagem p = null;
        if (classe.equals("Guerreiro")) {
            p = new Guerreiro(nome);
        }
        else
            if (classe.equals("Feiticeiro")) {
                p = new Feiticeiro(nome);
            }
            else
            if (classe.equals("Ladrão")) {
                p = new Ladrao(nome);
            }
            else {
                throw new IllegalArgumentException("Classe não existe: " + classe);
            }
        return p;
    }
    
}
