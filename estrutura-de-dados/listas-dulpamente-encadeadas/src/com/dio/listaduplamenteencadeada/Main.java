package src.com.dio.listaduplamenteencadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("E01");
        minhaListaEncadeada.add("E02");
        minhaListaEncadeada.add("E03");
        minhaListaEncadeada.add("E04");
        minhaListaEncadeada.add("E05");
        minhaListaEncadeada.add("E06");
        minhaListaEncadeada.add("E07");

        System.out.println(minhaListaEncadeada);
        
        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3, "E99");
        
        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.get(3));

    }

}
