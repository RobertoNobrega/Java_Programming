import java.io.*;

/*
    Lendo o arquivo, linha por linha.
*/

public class Exercicio5 {
    public static void main(String[] args){
        try{
            File arq = new File("teste3.txt");
            FileReader ler = new FileReader(arq);
            BufferedReader leitura = new BufferedReader(ler);
            String linha;
            System.out.println("\n\tLendo o arquivo.");
            /*
            while((linha = leitura.readLine()) != null)   // Funciona. Lendo linha por linha do arquivo.
                System.out.print(linha);
            */
            linha = leitura.readLine();
            System.out.print(linha);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
