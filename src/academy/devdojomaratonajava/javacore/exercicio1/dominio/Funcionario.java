package academy.devdojomaratonajava.javacore.exercicio1.dominio;

public class Funcionario {
    public String name = "";
    public int age = 0;
    public float[] salary = new float[3];

    public void imprimir() {
        System.out.println("--------------------");
        System.out.println(String.format("Nome: %s", this.name));
        System.out.println(String.format("Idade: %d", this.age));
        for (float salary : this.salary) {
            System.out.println(String.format(("R$ %.2f"), salary));
        }
        media();
    }

    public void media() {
        float mediaSalary = 0;
        for (float salary : this.salary) {
            mediaSalary += salary;
            mediaSalary /= this.salary.length;
        }
        System.out.println("--------------------");
        System.out.println(String.format("A média do salário é: R$ %.2f", mediaSalary));
    }
}
