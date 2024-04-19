package academy.devdojomaratonajava.javacore.Csobrecargametodos.test;

import academy.devdojomaratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.imprime();

    }
}
