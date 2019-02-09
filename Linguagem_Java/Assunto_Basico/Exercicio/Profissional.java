import java.util.ArrayList;

public class Profissional extends Pessoa{
	
	private String profissao;
	private String local_trabalho;

	public Profissional(ArrayList<String> dados){
		super(dados); // Chamando o construtor da classe pai, ou seja, da
		// classe Pessoa.
		this.profissao = dados.get(3);
		this.local_trabalho = dados.get(4);
	}

	public void exibirDados(){ // Sobrescrevendo o método da classe pai.
		super.exibirDados(); // Chamando o métoda da classe pai, ou seja, da
		// classe Pessoa.
		System.out.println("\tProfissão : " + profissao + "\n\tLocal "
		+ "de Trabalho : " + local_trabalho);
	}

}