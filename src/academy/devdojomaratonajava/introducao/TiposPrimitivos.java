package academy.devdojomaratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int castingTest = (int) 10000000000L;
        int age = 19;
        double heightDouble = 1.85D;
        float heightFloat = 1.85444f;
        char firstName = 34324;
        byte flags = 0b0;
        short temperature = -15;
        long population = 32432432;
        boolean isValid = true;

        String name = "João C. Prestes";
        String testy = "Test for type primitive 'String' - My name is " + name;


        System.out.println("The verified name and " + firstName);
        System.out.println(testy);
    }
}
