
public abstract class Classe1{
	/*
		Uma classe é abstrata, quando se usa a palavra abstract.
		Uma classe abstrata possui assinatura de métodos. Isso quer dizer
		que a classe abstrata não pode implementá-la, mas sim suas classes
		filhas, ou seja, as subclasses.
		Lembrando que numa Classe Abstrata, podemos ter atributos e métodos concretos,
		ou seja, já estão implementados os métodos e os atributos declarados.
		Uma classe pode ser abstrata, mesmo não tendo métodos abstratos.

		OBS : Não se podem criar objeto(s) a partir de classes abstratas.
		Será necessário ampliar essa classe a fim de criar uma instância da classe.
		
		Podem-se criar variáveis objeto de uma classe abstrata, embora essas variáveis
		tenham de fazer referência a um objeto de uma subclasse não abstrata.

		OBS 2 : Pode-se implementar construtor(es) de classe abstrata, porém, para chamar
		o construtor, tem que ser na classe filha (subclasse), ao qual o construtor da classe
		filha chama o construtor da classe pai com o método super.

		OBS 3 : Toda(s) a(s) assinatura(s) de método(s) abstrato(s) deve(m) ser implementado(s)
		pela(s) sua(s) subclasse(s).
		
	*/
	protected String mensagem; // Atributo da classe abstrata.

	public Classe1(){ } // "Construtor-Padrão" da classe abstrata.

	public Classe1(String mensagem){ // Outro construtor da classe abstrata.
		this.mensagem = mensagem;
	}

	public abstract void mensagem(); // Assinatura de método. Ou seja, é um método abstrato.
	// public abstract void mensagem5();

	public void mensagem2(String mensagem){ // Método Concreto.
		this.mensagem = mensagem;
		System.out.println(mensagem);
	}

	public void mensagem3(){
		System.out.println("\t" + mensagem);
	}

	public void mensagem4(){
		System.out.println("\n\tMensagem Fixa.");
	}
}