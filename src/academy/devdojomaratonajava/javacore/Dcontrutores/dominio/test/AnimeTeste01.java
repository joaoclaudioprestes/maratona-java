package academy.devdojomaratonajava.javacore.Dcontrutores.dominio.test;

import academy.devdojomaratonajava.javacore.Dcontrutores.dominio.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12);
        Anime anime2 =  new Anime("One Piece", "TV", 1000, "Shonen");
        anime2.imprime();
    }
}
