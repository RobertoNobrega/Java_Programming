import java.util.Scanner;

/*
*       Exercício URI : TIPO DE COMBUSTÍVEL
*/

public class Exercicio2{
    public static void main(String[] args){
        int codigo;
        Scanner entrada = new Scanner(System.in);
        while(true){
            while(true){
                System.out.print("\n\t\tInsira um número natural, entre 1 e 4  >> ");
                codigo = entrada.nextInt();
                if (codigo > 0 && codigo < 5)
                    break;
                System.out.print("\n\t\tValor Inválido. Tente Novamente.");
            }
            System.out.print("\n\t\tExibindo o código e Combustível (ou Mensagem)");
            switch(codigo){
                case 1:
                    System.out.println("\n\t\t\t1.Álcool");
                    break;
                case 2:
                    System.out.println("\n\t\t\t2.Gasolina");
                    break;
                case 3:
                    System.out.println("\n\t\t\t3.Diesel");
                    break;
                case 4:
                    System.out.println("\n\t\t\tMuito Obrigado. Encerrando Programa");
                    return;
            }
        }
    }
}
