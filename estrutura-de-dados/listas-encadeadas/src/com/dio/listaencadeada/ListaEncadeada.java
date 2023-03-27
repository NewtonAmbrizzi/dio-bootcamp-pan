package src.com.dio.listaencadeada;

public class ListaEncadeada<T> {

    No<T> refEntradaLista;

    public ListaEncadeada() {
        this.refEntradaLista = null;
    }

    public boolean isEmpty() {
        return this.refEntradaLista == null ? true : false;
    }

    public int size() {
        int size = 0;
        No<T> referenciaAuxiliar = refEntradaLista;
        while (true) {
            if (!isEmpty()) {
                size++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }
        return size;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No(conteudo);
        if (this.isEmpty()) {
            refEntradaLista = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntradaLista;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
    }

    private No<T> getNo(int index) {

        validaIndice(index);
        No<T> noAuxiliar = refEntradaLista;
        No<T> noRetorno = null;

        for (int i = 0; i < this.size() - 1; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index
                    + " desta lista. A lista vai apenast até o índice " + ultimoIndice + ".");
        }
    }



}
