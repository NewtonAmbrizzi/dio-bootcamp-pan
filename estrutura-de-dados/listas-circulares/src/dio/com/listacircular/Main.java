package src.dio.com.listacircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
    
        minhaListaCircular.add("E01");
        System.out.println(minhaListaCircular);
        
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        
        minhaListaCircular.add("E01");
        System.out.println(minhaListaCircular);
        
        minhaListaCircular.add("E02");
        minhaListaCircular.add("E03");
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));
        System.out.println(minhaListaCircular.get(3));
        System.out.println(minhaListaCircular.get(4));
        
        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }
    }
    
}
