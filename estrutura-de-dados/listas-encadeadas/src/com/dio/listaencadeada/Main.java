package src.com.dio.listaencadeada;

public class Main {

    public static void main(String[] args) {
        
        ListaEncadeada<String> novaLista = new ListaEncadeada<>();

        novaLista.add("Teste01");
        novaLista.add("Teste02");
        novaLista.add("Teste03");
        novaLista.add("Teste04");

        System.out.println(novaLista.get(0));
        System.out.println(novaLista.get(1));
        System.out.println(novaLista.get(2));
        System.out.println(novaLista.get(3));

        System.out.println(novaLista);
        
        System.out.println(novaLista.remove(0));
        
        System.out.println(novaLista);
    }
    
}
