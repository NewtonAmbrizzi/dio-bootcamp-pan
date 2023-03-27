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

        noAuxiliar.setProximoNo(novoNo);
    }

    public void add(T conteudo, int index) {
        No<T> novoNo = new No(conteudo);

        if (this.isEmpty()) {
            refEntradaLista = novoNo;
            return;
        }

        if (index == 0) {
            novoNo.setProximoNo(refEntradaLista);
            refEntradaLista = novoNo;
            return;
        }

        if (index > this.size()-1) {
            getNo(size()-1).setProximoNo(novoNo);
            novoNo.setProximoNo(null);
            return;
        }
        
        No<T> noAuxiliar = getNo(index);
        No<T> noAnterior = getNo((index - 1));
        
        novoNo.setProximoNo(noAuxiliar);
        noAnterior.setProximoNo(novoNo);

    }

    private No<T> getNo(int index) {

        validaIndice(index);
        No<T> noAuxiliar = refEntradaLista;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
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

    public T remove(int index) {

        No<T> noPivo = this.getNo(index);
        if(index == 0){
            refEntradaLista = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No<T> noAuxiliar = this.refEntradaLista;
        for (int i = 0; i < this.size(); i++) {
            stringRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        stringRetorno += "null]";

        return stringRetorno;
    }

    

}
