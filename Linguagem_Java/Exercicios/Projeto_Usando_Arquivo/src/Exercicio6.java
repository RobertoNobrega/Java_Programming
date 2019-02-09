import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Exercicio6 {
    public static void main(String[] args){
        try{
            File arq = new File("teste3.txt");
            FileReader ler = new FileReader(arq);
            BufferedReader leitura = new BufferedReader(ler);
            String linha;
            String[] aux;
            ArrayList<Integer> numeros = new ArrayList<Integer>();
            System.out.println("\n\tLendo o arquivo.");
            /*
            while((linha = leitura.readLine()) != null)   // Funciona. Lendo linha por linha do arquivo.
                System.out.print(linha);
            */
            //System.out.print(linha);
            linha = leitura.readLine();
            aux = linha.split(" ");
            System.out.print(aux[4]);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class ValidandoString
{
    public static void main(String[] args)
    {
        String texto = "Texto  a   ser    Corrigido.";
        String t = "";
        StringBuffer textoCorrigido = new StringBuffer();
        StringTokenizer token = new StringTokenizer(texto, " ");
        while(token.hasMoreTokens())
        {
            //textoCorrigido.append(token.nextToken() + " ");
            t = (textoCorrigido.append(token.nextToken() + "\n")).toString();
            //System.out.print(t);
        }
        System.out.println(textoCorrigido);
        System.out.print(t);
    }
}

class Teste{
    public static void main(String[] args) {
        String pro = "Java;Ruby;PHP";
        int um;
        int dois;
        um = pro.indexOf(";");
        dois = pro.lastIndexOf(";");
        System.out.println(pro.substring(um + 1, dois));
    }
}