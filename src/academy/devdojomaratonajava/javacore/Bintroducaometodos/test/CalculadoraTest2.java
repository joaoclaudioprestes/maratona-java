package academy.devdojomaratonajava.javacore.Bintroducaometodos.test;

import academy.devdojomaratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
    }
}
