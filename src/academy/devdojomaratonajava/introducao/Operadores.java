package academy.devdojomaratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritmeticos -> [+ = / *]
        int number1 = 10;
        int number2 = 20;


        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / (double) number2); // double pois não será possível realizar a divisão de 10/20, devido ao resultado ser um double(0.5)....
        System.out.println(number1 * number2);

        // Operador de resto [%]
        int resto = 20 % 2;
        System.out.println(resto);

        // Operador lógico [< > <= >= == !=]
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualAVinte = 10 >= 20;
        boolean isDezMenorIgualAVinte = 10 <= 20;
        boolean isDezIguaAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorIgualAVinte);
        System.out.println(isDezMenorIgualAVinte);
        System.out.println(isDezIguaAVinte);
        System.out.println(isDezDiferenteDeVinte);

        // Operador [&& (AND), || (OR), ! (NOT) ]
        int age = 19;
        float salary = 3500F;
        boolean isDetroDaLei = age > 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println(isDetroDaLei);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 20000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // Operadores de Atribuição [++ -- -= += *=/= %=]
        double bonus = 1600;
        bonus += 1000;
        bonus -= 102;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        // incrementar e decrementar
        int contador = 0;

        contador++;
        contador--;

        int contador2 = 0;
        ++contador2;
        --contador2;
    }
}
