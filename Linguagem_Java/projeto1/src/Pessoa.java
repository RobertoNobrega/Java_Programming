import java.util.ArrayList;

public class Pessoa {
    // Testando, usando o padrão de projeto Singleton.
    // É um padrão de Criação (processo de criação de objetos), de escopo de Objeto.
    // Podemos usar o Singleton, no caso de um Banco de Dados.
    private static Pessoa pessoa;
    private String nome, profissao;
    private int idade;

    private Pessoa(ArrayList<String> dados){ // Como o construtor é private, então somente na classe Pessoa é
        // que poderá chamá-lo.
        this.nome = dados.get(0);
        this.profissao = dados.get(1);
        this.idade = Integer.parseInt(dados.get(2));
    }

    public String getNome(){
        return nome;
    }

    public static Pessoa getPessoa(ArrayList<String> dados){
        if(pessoa == null)
            pessoa = new Pessoa(dados); // Aqui, já garante que o objeto será instânciado apenas
        // uma vez.
        return pessoa;
    }

    // O método abaixo, é para caso se esteja trabalhando com Threads.
    public static Pessoa gtPessoa(ArrayList<String> dados){
        if(pessoa == null){
            synchronized(Pessoa.class){ // Isto é um Monitor, para garantir que apenas entre uma thread neste trecho de código.
                if(pessoa == null)
                   pessoa = new Pessoa(dados);
            }
        }
        return pessoa;
    }
}

class Main{
    public static void main(String[] args){
        ArrayList<String> data = new ArrayList<String>();
        data.add(0,"Roberto Nóbrega");
        data.add(1,"Estudante");
        data.add(2,"28");
        Pessoa eu = Pessoa.getPessoa(data);
        System.out.println("\n\tNome : " + eu.getNome());
        ArrayList<String> data2 = new ArrayList<String>();
        data2.add(0,"Walmor Felício");
        data2.add(1,"Estudante");
        data2.add(2,"31");
        Pessoa wr = Pessoa.getPessoa(data2);
        System.out.println("\n\tNome 2 : " + wr.getNome());
    }
}