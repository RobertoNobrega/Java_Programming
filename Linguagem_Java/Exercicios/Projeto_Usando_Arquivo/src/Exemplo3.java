import java.io.*;
public class Exemplo3 {
    public static void main(String[] args){
        char numeros[] = {'1','7','9','0'};
        try{
            FileWriter arquivo;
            File arq = new File("teste3.txt");
            if(!arq.exists())
                arq.createNewFile();
            arquivo = new FileWriter(arq);
            for(int i = 0; i < numeros.length; ++i){
                arquivo.write(numeros[i]);
                if((i + 1) != numeros.length)
                    arquivo.write(" ");
            }
            arquivo.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
