package academy.devdojomaratonajava.javacore.exercicio1.test;

import academy.devdojomaratonajava.javacore.exercicio1.dominio.Funcionario;

public class Funcionario1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.name = "José";
        funcionario.age = 30;
        funcionario.salary = new float[]{1000, 2000, 3000};

        funcionario.imprimir();
    }
}
