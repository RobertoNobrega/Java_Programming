import java.io.IOException;
import java.io.File;

/*
	Neste exemplo, apenas criaremos um arquivo txt simples, sem nenhum dado, chamado teste.txt .
*/

public class Exemplo1{

	public static void main(String[] args){
		try{
			File arquivo = new File("/home/roberto/Documentos/Programacao/Linguagem_Java/Exercicios/Arquivo/teste.txt");
			if(!arquivo.exists())
				arquivo.createNewFile(); // Criando o arquivo txt.
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}