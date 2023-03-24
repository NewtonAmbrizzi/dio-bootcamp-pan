package com.dio;

public class Pilha {

    private No referenciaNoEntradaPilha;

    public Pilha() {

        this.referenciaNoEntradaPilha = null;

    }

    public No top() {
        return this.referenciaNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = this.referenciaNoEntradaPilha;
        this.referenciaNoEntradaPilha = novoNo;
        this.referenciaNoEntradaPilha.setReferenciaNo(refAuxiliar);
    }

    public No pop() {
        if (isEmpty()) {
            return null;
        }

        No noPoped = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
        return noPoped;
    }

    public boolean isEmpty() {
        return this.referenciaNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String string = "-------------------------\n";
        string += "    Pilha\n";
        string += "-------------------------\n";

        No noAuxiliar = this.referenciaNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null){
                string += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }

        string += "-------------------------\n";

        return string;
    }

}
