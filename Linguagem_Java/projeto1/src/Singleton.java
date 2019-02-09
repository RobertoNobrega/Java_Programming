public class Singleton {
    /*
        Padrão Singleton : Permite que a classe tenha somente uma instância no projeto e
        que essa instância seja de acesso global.
     */
    private static Singleton instancia; // Criando um atributo estático da classe Singleton,
    // ao qual só será usada nesta própria classe.
    private Singleton(){ } // Construtor da classe Singleton, ao qual seu nível de acesso é
    // private, ou seja, só esta classe é que pode chamá-la.
    public static Singleton getInstancia(){
        if(instancia == null)
            instancia = new Singleton(); // Instanciando um objeto desta mesma classe. Garantia de que
        // esta variável será instanciada apenas uma vez.
        return instancia;
    }
    /*
    public static void main(String[] args){
        // System.out.println("\n\tOi. Isto é um programa em Linguagem Java.");
    }
    */
}
