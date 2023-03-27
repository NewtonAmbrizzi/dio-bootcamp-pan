package src.com.dio.listaduplamenteencadeada;

public class NoDuplo<T> {
    
    private T conteudo;
    private NoDuplo<T> noPosterior;
    private NoDuplo<T> noAnterior;
    
    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(NoDuplo<T> noProximo) {
        this.noPosterior = noProximo;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noPrevio) {
        this.noAnterior = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }

}
