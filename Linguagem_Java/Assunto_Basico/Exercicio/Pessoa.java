import java.util.ArrayList; // Importando o pacote, para poder usar a classe
// de ArrayList.

public class Pessoa{
	// Abaixo, temos atributos encapsulados com o private, significando que
	// apenas a classe Pessoa tem acesso a elas.
	private String nome, cpf;
	private int idade;

	public Pessoa(ArrayList<String> dados){ // Construtor da classe Pessoa.
		this.nome = dados.get(0);
		this.cpf = dados.get(1);
		this.idade = Integer.parseInt(dados.get(2));
	}

	public void exibirDados(){ // Método da classe. Não recebe nenhum argumento.
		System.out.println("\n\tNome : " + nome + "\n\tCPF : " + cpf
		+ "\n\tIdade : " + idade + " anos");
	}

}