package academy.devdojomaratonajava.javacore.Aintroducaoclasses.dominio;

public class Estudante {
   public String nome = "Zoro"; // Inicializção padrão
   public int idade;
   public char sexo;

   public void imprime() {
      System.out.println("-------------------");
      System.out.println(this.nome);
      System.out.println(this.idade);
      System.out.println(this.sexo);
   }
}
