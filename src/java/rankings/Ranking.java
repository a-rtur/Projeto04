package rankings;

public class Ranking {
    private String nome;
    private int resultado;
    private String data;

    public Ranking(String nome, int resultado, String data) {
        this.nome = nome;
        this.resultado = resultado;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
}
