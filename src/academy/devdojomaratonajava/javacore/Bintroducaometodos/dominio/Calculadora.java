package academy.devdojomaratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int number1, float number2) {
        System.out.println(number1 * number2);
    }

    public double divisor(double number1, double number2) {
        if (number2 == 0) {
            return 0;
        }
        return number1 / number2;
    }

    public void alteraDoisNumeros(int a, int b) {
        int number1 = a;
        int number2 = b;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

    }

    public void somaArray(int[] numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }

}
