package academy.devdojomaratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void getData()
    {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setData(String nome, int idade)
    {
        this.nome = nome;

        if(idade <= 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }
}
