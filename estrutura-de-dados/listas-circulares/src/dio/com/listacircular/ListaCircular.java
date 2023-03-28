package src.dio.com.listacircular;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> calda;
    private int tamanhoLista;

    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

}
