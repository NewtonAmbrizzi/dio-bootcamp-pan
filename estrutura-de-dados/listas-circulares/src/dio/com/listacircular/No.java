package src.dio.com.listacircular;

public class No<T> {

    private T element;
    private No<T> proximoNo;
    
    public No(T element) {
        this.element = element;
        this.proximoNo = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No [element=" + element + "]";
    }
    
    
}
