package classesDoProjeto;

public class Jogadores {
    private String nome;
    private double mediaJogos;
    private String[] jogosAnteriores = new String[10];
    
    public Jogadores(String nome) {
        this.nome = nome;
        this.mediaJogos = 0;
    }
    
    public Jogadores(String nome, double mediaJogos, String jogosAnteriores[]) {
        this.nome = nome;
        this.mediaJogos = mediaJogos;
        this.jogosAnteriores = jogosAnteriores;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaJogos() {
        return mediaJogos;
    }

    public void setMediaJogos(double mediaJogos) {
        this.mediaJogos = mediaJogos;
    }

    public String[] getJogosAnteriores() {
        return jogosAnteriores;
    }

    public void setJogosAnteriores(String[] jogosAnteriores) {
        this.jogosAnteriores = jogosAnteriores;
    }
}
