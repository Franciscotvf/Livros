package br.com.etechoracio.playLivros.test;

import br.com.etechoracio.playLivros.enums.VersaoEnum;
import br.com.etechoracio.playLivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        Livro livro= new Livro();
        livro.titulo = "Brawlhalla";
        livro.autor = "sandstorm";
        livro.narrador = "Lebron james";
        livro.duracao = LocalTime.of(12, 67);
        livro.versao = VersaoEnum.ESTENDIDA;
        livro.preco = 30.90;
        livro.resumo = "Aprenda o básico do brawlhalla seu betinha!!!";


        Livro segundolivro = new Livro();
        segundolivro.titulo = "Plays de foice";
        segundolivro.autor = "Pavelski";
        segundolivro.narrador = "Carl sagan";
        segundolivro.duracao = LocalTime.of(10, 45);
        segundolivro.versao = VersaoEnum.INTEGRAL;
        segundolivro.preco = 10.90;
        segundolivro.resumo = "As melhores jogadas de foice!!!";


    }

}
