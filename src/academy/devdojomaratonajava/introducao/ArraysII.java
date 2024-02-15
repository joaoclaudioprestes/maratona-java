package academy.devdojomaratonajava.introducao;

public class ArraysII {
    public static void main(String[] args) {
        // byte, short, int, long, float, e double
        // char ''
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "João";
        nomes[1] = "Felipe";
        nomes[2] = "Matheus";

        for (int i = 0; i <= nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];


    }
}
