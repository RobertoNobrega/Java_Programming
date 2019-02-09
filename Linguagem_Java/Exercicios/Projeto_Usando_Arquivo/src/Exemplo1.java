import java.io.File;
import java.io.IOException;

public class Exemplo1 {

    /*
            Neste exemplo, iremos apenas criar um arquivo txt, sem nada de dados e mostrar se tem ou não conteúdo.
    */

    public static void main(String[] args){
        try{
            File arquivo = new File("teste.txt"); // Instanciando um objeto da classe File, ao qual,
            // recebe uma String como argumento, informando o caminho (onde vai ficar armazenado) e nome do
            // arquivo (que neste caso, é um txt). Ele vai se chamar teste, e estará na pasta do projeto, ou seja,
            // dentro do src.

            if(!arquivo.exists()) { // Se o arquivo não existir, vai criar o arquivo.
                arquivo.createNewFile();
                System.out.println("\n\tArquivo criado.");
            }else{
                System.out.println("\n\tArquivo txt já foi criado com sucesso.");
            }
            System.out.println("\n\tQuantidade de elementos no arquivo : " + arquivo.length());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
