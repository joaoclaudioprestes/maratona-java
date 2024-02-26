package academy.devdojomaratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojomaratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest3 {
    public static void main(String[] args) {
        Estudante maria = new Estudante();

        maria.nome = "Maria";
        maria.idade = 18;
        maria.sexo = 'F';

        maria.imprime();
    }
}
