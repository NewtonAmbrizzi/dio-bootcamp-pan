package src.dio.com.listacircular;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;


    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;

    }

    public T get(int index) {
        return this.getNo(index).getElement();
    }

    public void remove(int index) {

        if (index > this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice é maior que a lista");
        }
        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public void add(T element) {

        No<T> novoNo = new No<>(element);

        if (isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(this.cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            this.cauda = novoNo;
            this.cabeca.setProximoNo(this.cauda);            
        }

        this.tamanhoLista++;

    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            stringRetorno += "[No{conteudo=" + noAuxiliar.getElement() + "}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        stringRetorno += this.isEmpty() ? "[]" : "(retorna ao início)";
        return stringRetorno;
    }

    

}
