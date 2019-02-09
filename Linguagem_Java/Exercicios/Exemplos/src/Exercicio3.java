import java.util.Scanner;

/*
*       Exercício URI : FIBONACCI
*/

public class Exercicio3 {
    public static void main(String[] args){
        int tamanho, proximo = 1, anterior = 0, auxiliar;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\tPrograma \"Sequência de FIBONACCI\"");
        while(true){
            System.out.print("\n\t\tInsira a quantidade de valores da sequência (entre 1 e 45) >> ");
            tamanho = entrada.nextInt();
            if(tamanho > 0 && tamanho < 46)
                break;
            System.out.print("\n\t\tValor Inválido. Tente Novamente");
        }
        System.out.print("\n\t\tSequência de Fibonacci com " + tamanho + " número(s).\n\t\t\t");
        for(int i = 1; i <= tamanho; ++i){
            if(i == 1)
                System.out.print("0 ");
            else if(i == 2)
                System.out.print("1 ");
            else{
                auxiliar = proximo + anterior;
                anterior = proximo;
                proximo = auxiliar;
                System.out.print(proximo + " ");
            }
        }
    }
}
