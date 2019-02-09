import java.util.Scanner;

/*
*        Exercício URI : PAR OU ÍMPAR
*/

public class Exercicio1 {

    public static void main(String[] args){
        int tamanho, valor;
        Scanner entrada = new Scanner(System.in);
        while(true) {
            System.out.print("\n\t\tQuantidade de valores, que devem ser lidos >>  ");
            tamanho = entrada.nextInt();
            if(tamanho > 0 && tamanho < 10000)
                break;
            System.out.print("\n\t\tTamanho Inválido. Tente Novamente");
        }
        System.out.println("\n\t\tInserindo valores e mostrando mensagem.");
        for(int i = 0; i < tamanho; ++i){
            while(true) {
                System.out.print("\n\t\tValor " + (i + 1) + " : ");
                valor = entrada.nextInt();
                if(valor > -10000000 && valor < 10000000)
                    break;
                System.out.println("\n\t\tValor Inválido. Tente Novamente.");
            }
            if(valor % 2 == 0){
                if(valor == 0)
                    System.out.println("\n\t\t" + valor + " >> POSITIVE and NULL");
                else if(valor > 0)
                    System.out.println("\n\t\t" + valor + " >> POSITIVE and EVEN");
                else
                    System.out.println("\n\t\t" + valor + " >> NEGATIVE and EVEN");
            }else{
                if(valor > 0)
                    System.out.println("\n\t\t" + valor + " >> POSITIVE and ODD");
                else
                    System.out.println("\n\t\t" + valor + " >> NEGATIVE and ODD");
            }
        }
  
