public class NoDuplo<T>{

    private T dado;
    private int indice;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;

    public NoDuplo(T dado, int indice){
        this.dado = dado;
        this.indice = indice;
        this.proximoNo = null;
        this.anteriorNo = null;
    }
    
    public int getIndice() {
        return indice;
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public NoDuplo<T> getAnteriorNo() {
        return anteriorNo;
    }
    public void setAnteriorNo(NoDuplo<T> anteriorNo) {
        this.anteriorNo = anteriorNo;
    }
    
    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public T getDado() {
        return dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }

    @Override
    public String toString(){
        return "{Índice: " + getIndice() + ", Dado: " + getDado() + "}";
    }
}