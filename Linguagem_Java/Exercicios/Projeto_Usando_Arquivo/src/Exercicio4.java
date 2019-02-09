import java.io.*;

/*
        Lendo Arquivo.
 */

public class Exercicio4 {
    public static void main(String[] args){
        try{
            FileReader ler;
            int c;
            File arq = new File("teste3.txt");
            if(!arq.exists())
                return;
            ler = new FileReader(arq);
            c = ler.read();
            while(c != -1){
                System.out.print((char)c);
                c = ler.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
