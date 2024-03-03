package academy.devdojomaratonajava.javacore.Bintroducaometodos.test;

import academy.devdojomaratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01
{

    public static void main(String[] args)
    {
        Calculadora calcular = new Calculadora();

        System.out.println("---- Soma ----");
        calcular.somaDoisNumeros();

        System.out.println("---- Subtração ----");
        calcular.subtrairDoisNumeros();

        System.out.println("---- Multiplicação ----");
        calcular.multiplicaDoisNumeros(45,60.54F);

        System.out.println("---- Divisão ----");
        System.out.println((int) calcular.divisor(12.34D, 3.5D));

        System.out.println("---- Altera Dois Numeros ----");
        int a = 1;
        int b = 87;

        calcular.alteraDoisNumeros(a, b);
        System.out.println(a);
        System.out.println(b);
    }


}
