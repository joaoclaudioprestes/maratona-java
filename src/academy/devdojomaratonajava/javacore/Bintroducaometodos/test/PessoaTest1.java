package academy.devdojomaratonajava.javacore.Bintroducaometodos.test;

import academy.devdojomaratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest1 {
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setData("Mestre do Código", 340);

        pessoa.getData();
    }
}
