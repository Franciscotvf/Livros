package br.com.etechoracio.playLivros.model;

import br.com.etechoracio.playLivros.enums.VersaoEnum;

import java.time.LocalTime;

public class Livro {
   //tipo nomeVariavel;
   public String titulo;
   public String autor;
   public String narrador;
   public String editora;
   public LocalTime duracao;
   public VersaoEnum versao;
   public double preco;
   public String resumo;
}
