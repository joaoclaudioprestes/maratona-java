package academy.devdojomaratonajava.javacore.Dcontrutores.dominio.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String nome, String tipo, int episodios) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.init(nome, tipo, episodios);
    }

    public Anime(String nome, String tipo, int episodios, String genero) {
        this(nome, tipo, episodios);
        this.genero = genero;
        this.init(nome, tipo, episodios);
    }

    public Anime() {
        System.out.println("Sem argumentos!");
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
}
