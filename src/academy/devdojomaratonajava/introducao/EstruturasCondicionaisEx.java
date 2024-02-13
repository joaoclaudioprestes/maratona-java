package academy.devdojomaratonajava.introducao;

public class EstruturasCondicionaisEx {
    public static void main(String[] args) {
        double salary = 1000333D;
        double tax = 0;
        double result = 0;

        if (salary <= 34712) {
            tax = 9.70;
        } else if (salary > 34713 && salary <= 68507) {
            tax = 37.35;
        } else {
            tax = 49.50;
        }

        result = salary - ((tax * salary) / 100);
        System.out.printf("O valor do seu salário foi de R$ %.2f. Devido a isso, você pagará uma porcentagem de %.2f%% sobre o valor total do seu salário. Portanto, você pagou R$ %.2f de imposto.\n", salary, tax, (salary - result));
    }
}
