import java.io.*;

/*
    Escrevendo em arquivo. Nesse caso, iremos escrever números.
*/

public class Exemplo2 {
    public static void main(String[] args){
        char numeros[] = {'1','2','3'};
        try{
            File arquivo = new File("teste2.txt");
            if(!arquivo.exists())
                arquivo.createNewFile();
            FileWriter ar = new FileWriter(arquivo); // Para escrever no arquivo.
            ar.write(numeros);
            ar.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
