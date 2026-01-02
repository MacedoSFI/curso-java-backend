package modulo4;

public class RespostaAPI<T> {
    private T dados;
    private int status;

    public RespostaAPI(T dados, int status) {
        this.dados = dados;
        this.status = status;
    }

    public T getDados() {
        return dados;
    }
}
