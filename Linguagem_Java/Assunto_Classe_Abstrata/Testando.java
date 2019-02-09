
public class Testando extends Classe1{

	/* 
		A classe Testando herda da classe Classe1, ao qual a classe pai é
		uma classe abstrata.
		Então, a classe Testando precisa implementar o(s) método(s) abstrato(s)
		da classe abstrata.
	*/

	public Testando(){ } // "Construtor Padrão" da classe Testando.

	public Testando(String mensagem){
		super(mensagem); // Chamando o construtor da classe pai, que tem um argumento
		// como parâmetro. Lembrando que a classe pai é uma classe abstrata.
		// O construtor da classe pai chamada é a que recebe uma String como parâmetro. 
	}

	public void mensagem(){ // Implementando o método abstrato.
		System.out.println("\n\tProgramando em Java, usando classe abstrata.\n");
	}

	public static void main(String[] args){
		Classe1 cl1 = new Testando(); // Válido. Observo que está usando o conceito de Polimorfismo aqui.
		Classe1 cl2 = new Testando("\tNovamente, programando em Java, usando classe abstrata"); // Mesma coisa acima.
		Testando ts1 = new Testando();
		cl1.mensagem(); // Chamando um "método de objeto", apesar que pertence a classe Testando.
		cl2.mensagem3();
		System.out.println("\n\n\tTestando para o objeto da classe Testando.");
		ts1.mensagem3(); // Funcionou. Vai aparecer null, pois a variável mensagem não está sendo inicializada pelo construtor da
		// superclasse.
		ts1.mensagem4(); // Funcionou.
	}
} 