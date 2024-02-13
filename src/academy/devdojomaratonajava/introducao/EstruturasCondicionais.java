package academy.devdojomaratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        boolean isTrue = true;
        double saldo = 1000;

        if (isTrue){
             System.out.println("Sim verdadeiro!");
        }

        int age = 19;
        boolean isAutorizadoComprarBebida = age >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Cliente autorizado a comprar bebida!");
            isAutorizadoComprarBebida = false;
            System.out.println(isAutorizadoComprarBebida);
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Cliente não autorizado a comprar bebida!");
        }

        if (age >= 18 && saldo >= 1000) {
            System.out.println("Consegue iniciar o processo da CNH!");
        } else if (age < 18 || saldo < 1000 ) {
            System.out.println("Não pode iniciar o processo de retirada da CNH!");
        }

        int media = 10;

        if (media == 10) {
            System.out.println("Passou com media 10!!!");
        } else if (media >= 7) {
            System.out.println("Passou de ano!");
        }  else if (media < 7 && media > 4 ) {
            System.out.println("Ficara de recuperação");
        } else {
            System.out.println("Ficara retido!");
        }

        String resultadoDoar = saldo > 5000 ? "0" : "Não doar... Saldo menor que R$ 5000";

        System.out.println(resultadoDoar);



    }
}
