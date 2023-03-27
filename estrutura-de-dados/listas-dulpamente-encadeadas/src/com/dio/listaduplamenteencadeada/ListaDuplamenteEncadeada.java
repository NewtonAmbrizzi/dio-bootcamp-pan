package src.com.dio.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNoDuplo;
    private NoDuplo<T> ultimoNoDuplo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNoDuplo = null;
        this.ultimoNoDuplo = null;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {

        NoDuplo<T> noAuxiliar = this.primeiroNoDuplo;

        for (int i = 0; (i <= index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoPosterior();
        }

        return noAuxiliar;
    }

    public T get(int index) {

        NoDuplo<T> noAuxiliar = getNo(index);
        return noAuxiliar.getConteudo();

    }

    public void add(T element) {

        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoPosterior(null);
        if (size() == 0) {
            novoNo.setNoAnterior(null);
            primeiroNoDuplo = novoNo;
            ultimoNoDuplo = novoNo;
            tamanhoLista++;
            return;
        }

    }

    

}
