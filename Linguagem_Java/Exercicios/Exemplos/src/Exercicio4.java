import java.util.Scanner;

/*
*     Exercício URI : NÚMERO PRIMO
*/

public class Exercicio4{
    public static void main(String[] args){
        int valor, tamanho, j, contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\tPrograma \"Número Primo\"");
        while(true){
            System.out.print("\n\t\tInsira a quantidade de números (entre 1 e 100), que deseja testar >> ");
            tamanho = entrada.nextInt();
            if(tamanho > 0 && tamanho <= 100)
                break;
            System.out.print("\n\t\tValor Inválido. Tente Novamente");
        }
        for(int i = 1; i <= tamanho; ++i){
            while(true){
                System.out.print("\n\t\tInsira o valor de entrada, entre 1 e 10000000  >> ");
                valor = entrada.nextInt();
                if (valor <= 0 || valor > 10000000) {
                    System.out.print("\n\t\tValor Inválido. Tente Novamente.");
                    continue;
                }
                for(j = 1; j <= valor; ++j){
                    if(valor % j == 0)
                        ++contador;
                }
                if(contador == 2)
                    System.out.println("\n\t\t\t" + valor + " é primo.");
                else if(valor == 1)
                    System.out.println("\n\t\t\t1 é primo.");
                else
                    System.out.println("\n\t\t\t" + valor + " não é primo.");
                contador = 0;
                break;
            }
        }
    }
}
