import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listaPessoa = new ArrayList<String>();

        listaPessoa.add("João");
        listaPessoa.add("Maria");
        listaPessoa.add("José");
        listaPessoa.add("Pedro");
        listaPessoa.add("Ana");

        for(int i = 0; i < listaPessoa.size(); i++){
            String aux = listaPessoa.get(i);
            System.out.println(aux);
        }

        int posicao = listaPessoa.indexOf("Pedro");


        listaPessoa.set(posicao, "Pedro Henrique");

        System.out.println("====================================");

        listaPessoa.remove("José");
        listaPessoa.remove(1);

        for(String aux : listaPessoa){
            System.out.println(aux);
        }


    }
}
