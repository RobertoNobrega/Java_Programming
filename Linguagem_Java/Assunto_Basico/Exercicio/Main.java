import java.util.ArrayList;

public class Main{

	private ArrayList<String> dados;
	
	public Main(){
		dados = new ArrayList<String>();
		dados.add(0,"Walmor Silva");
		dados.add(1,"000.000.000-00");
		dados.add(2,"31");
		dados.add(3,"UFPB");
		dados.add(4,"7");
		dados.add(5,"2018");
	}
	
	public ArrayList<String> getDados(){
		return dados;
	}

	public static void main(String[] args){
		ArrayList<String> dados2 = new ArrayList<String>();
		Main main = new Main();
		Estudante estudante = new Estudante(main.getDados());
		estudante.exibirDados(); // Chamando o método sobrescrito pela
		// classe filha, ou seja, da classe Estudante.
		dados2.add(0,"Walmor Silva");
		dados2.add(1,"000.000.000-00");
		dados2.add(2,"31");
		dados2.add(3,"Estudante");
		dados2.add(4,"ND");
		Pessoa pessoa = new Profissional(dados2); // Aqui, estamos usando o conceito de
		// Polimorfismo, ao qual, a classe Profissao é uma subclasse de Pessoa. Então
		// um objeto da classe pai pode assumir o papel de sua subclasse.
		pessoa.exibirDados(); // Chamando o método da subclasse Profissional.
	}
}