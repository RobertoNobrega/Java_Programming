public class Revisao2{

    private int numero; // Acesso somente na classe Revisao2.
    protected int numero2; // Acesso na classe Revisao2, em seus filhos (subclasses) e outras classes
    // do mesmo pacote.
    /*
        Métodos e Atributos declarados com o protected em uma superclasse devem ser definidos como
        protected ou public em suas subclasses e nunca como private.
    */
    int teste = 45;  // Como não tem modificador de acesso, ele será de tipo default, ou seja, as classes
    // que estão no mesmo pacote da classe Revisao2, poderão vê-lo.  Símbolo no diagrama de classes :  ~
    public Revisao2(){ } // "Construtor Padrão".

    public Revisao2(int numero, int numero2){
        this.numero = numero;
        this.numero2 = numero2;
    }

    public void exibaNumeros(){
        System.out.println("\n\tNúmero 1 : " + numero + "\n\tNúmero 2 : " + numero2);
    }
}

class Test extends Revisao2{
    public void inic(){
        exibaNumeros();
    }
    public void exibaNumeros(){ // Sobrescrevendo Método da SuperClasse.
        // System.out.println("\n\tNúmero 2 : " + numero2 + "\n\tNúmero 2 : " + numero);  // Não pode acessar numero, pois ele é private.
        System.out.println("\n\n\tNúmero 2 : " + numero2 + "\n\n");
        super.exibaNumeros(); // Chamando o método da SuperClasse.
    }
    public static void main(String[] args){
        Test t = new Test();
        t.inic();
        t.exibaNumeros();
        // super.exibaNumeros(); // Chamando o método da SuperClasse, mas não funciona, pois exibaNumeros não é static.
    }
}
