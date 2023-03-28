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
        novoNo.setNoAnterior(ultimoNoDuplo);
        ultimoNoDuplo = novoNo;
        this.tamanhoLista++;
        if (primeiroNoDuplo == null) {
            primeiroNoDuplo = novoNo;
        }

    }

    public void add(int index, T element) {

        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoPosterior(noAuxiliar);

        if (novoNo.getNoPosterior() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNoDuplo);
            ultimoNoDuplo = novoNo;
        }

        if (index == 0) {
            primeiroNoDuplo = novoNo;
        } else {
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }

        this.tamanhoLista++;

    }

    public void remove(int index) {

        NoDuplo<T> noAuxiliar = getNo(index);

        if (noAuxiliar == ultimoNoDuplo) {
            ultimoNoDuplo = noAuxiliar.getNoAnterior();
            noAuxiliar.getNoAnterior().setNoPosterior(null);
        }
        if (index == 0) {
            primeiroNoDuplo = noAuxiliar.getNoPosterior();
            noAuxiliar.getNoPosterior().setNoAnterior(null);
        } else {
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
            noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
        }

        this.tamanhoLista--;

    }

}
