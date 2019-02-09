public class Pessoa{
	
	String nome, profissao, universidade, curso;
	int idade;

	public Pessoa(){   /** Construtor Padrão, sendo modificado. */
		nome = "Walmor";
		profissao = "Estudante";
		universidade = "UFPB";
		idade = 31;
	}
	
	public Pessoa(String curso){  /** Construtor da classe Pessoa, criado pelo próprio programador. */
        this(); // Este this está chamando o construtor da classe Pessoa, ao qual não apresenta nenhum
        // argumento. Ou seja, está chamando esse construtor construtor acima ->  public Pessoa() { ... }
		this.curso = curso; // Nesse caso, quando usa o this.  significa que está se referenciando a algo
		// dentro da própria classe. Nesse caso, this.curso  se refere ao atributo String curso, da própria
		// classe Pessoa, pois na atribuição this.curso = curso;   a variável do lado diretito do sinal de
		// igualdade se refere a variável do argumento do construtor Pessoa.
	}

	public void exibirPessoa(){
		System.out.println("\n\tNome : " + nome + "\n\tIdade : " + idade + " anos" + "\n\tProfissão : " + profissao
		+ "\n\tUniversidade : " + universidade + "\n\tCurso : " + curso);
	}

	public static void main(String[] args){
		/*
		Pessoa pessoa = new Pessoa();
		pessoa.exibirPessoa();
		pessoa.nome = "Walmor";
		pessoa.idade = 31;
		pessoa.profissao = "Estudante";
		pessoa.exibirPessoa();
		*/
		Pessoa pessoa2 = new Pessoa("Sistemas de Informação");
		pessoa2.exibirPessoa();
	}

}