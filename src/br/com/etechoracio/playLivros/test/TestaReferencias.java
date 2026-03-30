package br.com.etechoracio.playLivros.test;

import br.com.etechoracio.playLivros.model.Livro;

public class TestaReferencias {

    static void main() {
        Livro livroA = new Livro();
        livroA.titulo = "Meu livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu br.com.etechoracio.playLivros.model.Livro B";
        System.out.println(livroB.titulo);

        System.out.println(livroA.titulo);

   }



}
