public class NoDuplo<T>{

    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;

    public NoDuplo(T dado){
        this.dado = dado;
        this.proximoNo = null;
        this.anteriorNo = null;
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
        return "{ " + getDado() + " }";
    }
}