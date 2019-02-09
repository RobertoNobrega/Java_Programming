import java.util.ArrayList;

public class Estudante extends Pessoa{ // Usando o conceito de Herança.
  // A classe Estudante vai herdar os métodos e atributos da classe Pessoa.

  private String escola;
  private int serie;
  protected int ano;

  public Estudante(ArrayList<String> dados){
     super(dados); // Chamando o construtor da classe pai, ou seja, a classe
     // Pessoa. Com o super, podemos chamar qualquer método da classe pai.
     this.escola = dados.get(3);
     this.serie = Integer.parseInt(dados.get(4)); // Integer.parseInt -> Convertendo
     // um número, em formato de uma String, para um valor de tipo int.
     this.ano = Integer.parseInt(dados.get(5));
  }

  /*
	    OBS : Um método public da subclasse pode sobrescrever um método private da
	    classe pai, ou seja, da superclasse. Porém o inverso não é verdadeiro.
	    Lembrando que na sobrescrita de método, a regra funciona quando o método sobrescrito (na(s) classe(s)
	    filha(s)) tem que ter o mesmo nome, tipo de retorno e mesmos argumentos, que foram definidos no
	    método original, que se encontra na classe pai.
	    OBS : Sobrescrita e Sobrecarga são conceitos Polimórficos.
  */

  public void exibirDados(){ // Neste caso, estamos sobrescrevendo esse método.
     super.exibirDados(); // Chamando o método exibirDados, da classe pai.
     // O que estamos fazendo é uma boa prática de reuso de código, como no caso do
     // uso de Herança.
     System.out.println("\tEscola : " + escola + "\n\tSérie : " + serie
     + "\n\tAno : " + ano);
  }

}
