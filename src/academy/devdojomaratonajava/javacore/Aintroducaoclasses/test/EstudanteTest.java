package academy.devdojomaratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojomaratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();

        joao.nome = "João";
        joao.idade = 19;
        joao.sexo = 'M';

        System.out.println(joao.nome);
        System.out.println(joao.idade);
        System.out.println(joao.sexo);
    }
}
