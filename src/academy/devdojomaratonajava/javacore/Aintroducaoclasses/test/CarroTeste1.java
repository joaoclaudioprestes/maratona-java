package academy.devdojomaratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojomaratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste1 {
    public static void main(String[] args) {
        Carro esportivo = new Carro();

        esportivo.nome = "Ferrari";
        esportivo.modelo = "V8";
        esportivo.ano = 2023;


        Carro suv = new Carro();

        suv.nome = "Palisade";
        suv.modelo = "SUV";
        suv.ano = 2024;


        System.out.println(esportivo.nome);
        System.out.println(esportivo.modelo);
        System.out.println(esportivo.ano);
        System.out.println("-----------------------------------------------");
        System.out.println(suv.nome);
        System.out.println(suv.modelo);
        System.out.println(suv.ano);

    }
}
