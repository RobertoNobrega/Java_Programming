
public class Revisao {
    /*
        Quando se usa a palavra static em método, significa que o método pertence a própria classe, mas não a instância
        da mesma classe.
        OBS : Os métodos que possuem a palavra static, são chamados de Métodos de Classe.
        Métodos de Instância : São métodos que são chamados quando se instancia um objeto de uma classe e chama-o por meio desse
        objeto de classe.
        Variáveis de Instância : Variáveis que estão presentes no objeto da classe.
        Variáveis de Classe : Campos que estão presentes na própria classe e são compartilhados por todos os objetos dela.
        Atributo : Campo ou Variável de uma classe.
    */
    static int numero;
    int numero2 = 34;

    public static void mensagem(){
        // System.out.println("\n\tTeste de Programa. Número " + numero + "\n\tNúmero 2 : " + numero2); // Não pode acessar um atributo não estático,
        // dentro de um método estático, de forma direta.
        System.out.println("\n\tTeste de Programa. Número " + numero);
    }

    public void termine(){
        System.out.println("\n\tTerminou.");
    }
    public void mensagem2(){
        System.out.println("\n\tTeste 2. Número " + numero + "\n\tNúmero 2 : " + numero2);
        mensagem();
        termine();
    }

    public static void main(String[] args){
        mensagem();
        // mensagem2();   // Inválido a chamada.
        Revisao rev = new Revisao();
        rev.mensagem2();
    }
}
