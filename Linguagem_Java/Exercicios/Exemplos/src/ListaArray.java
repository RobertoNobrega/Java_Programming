import java.util.ArrayList;

public class ListaArray {

    private ArrayList<Integer> numeros = new ArrayList<Integer>();

    public ArrayList<Integer> num(int tam){
        ArrayList<Integer> n = new ArrayList<Integer>();
        if(tam == 0)
            return null;
        for(int i = 0; i < tam; ++i)
            n.add(i,i * 4);
        numeros = n;
        return n;
    }

    public void exiba(){
        for(int i = 0; i < numeros.size(); ++i)
            System.out.printf("\n\t\tValor %d : %d",(i + 1),numeros.get(i));
    }

    public static void main(String[] args){
        ListaArray li = new ListaArray();
        ArrayList<Integer> Ar = li.num(5);
        for(int i = 0; i < Ar.size(); ++i)
            System.out.printf("\n\t\tValor %d : %d",(i + 1),Ar.get(i));
        System.out.print("\n\n\n\tVerificando com o outro ArrayList.\n");
        li.exiba();
    }
}
