package academy.devdojomaratonajava.introducao;

public class EstruturasCondicionaisII {
    public static void main(String[] args) {
        int dayInput = 2;

        switch (dayInput) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Inválido!");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'F':
                System.out.println("Mulher");
                break;
            case 'M':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Inválido!");
                break;
        }

        // Exercicio
        byte dayEx = 1;

        switch (dayEx) {
            case 1:
            case 7:
                System.out.println("Final de Semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Inválido!");
                break;
        }

        //Estruturas while, do while, for

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i <= 20);

        for (int i2 = 0;i2 < 10; i2++) {
            System.out.println("For "+ +i2);
        }

        // Exercicio For
        int stop = 10;

        for (int number = 1;number <=  stop; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        int valorMax = 50;

        for (int i3 = 1; i3 <= valorMax; i3++) {
            if (i3 > 25) {
                break;
            }
            System.out.println(i3);
        }

        double valorCarro = 50349;

        /*for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela= valorCarro / parcela;

            if (valorParcela >= 1900) {
                System.out.println("Parcela "+ parcela +": R$ "+ valorParcela);
            } else {
                break;
            }
        } */

        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                continue;
            }

            System.out.println("Parcela ["+parcela+"]: R$ "+ valorParcela);
        }
    }
}
