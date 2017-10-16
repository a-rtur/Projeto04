package jogadores;

import data.Data;
import global.FormatoDecimal;

public class Jogadores {
    private String nome;
    private int quantidadeJogos;
    private int somaPontuacao;
    private String[] jogosAnteriores = new String[10];
    private String[] dataDoJogo = new String[10];
    
    public Jogadores(String nome) {
        this.nome = nome;
        this.jogosAnteriores = new String[10];
        this.quantidadeJogos = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaJogos() {
        if (quantidadeJogos == 0) {
            return 0;
        }
        else {
            return (double) somaPontuacao/quantidadeJogos;
        }
    }

    public String getJogosAnteriores(int index) {
        return this.jogosAnteriores[index];
    }
    
    public String getDataDoJogo(int index) {
        return this.dataDoJogo[index];
    }

    public void setJogosAnteriores(int acertos) {
        moverArray();
        jogosAnteriores[0] = Integer.toString(acertos);
        dataDoJogo[0] = Data.retornarData();
    }
    
    public void moverArray() {
        String[] auxJogos = new String [10];
        String[] auxData = new String [10];
        for(int i = 0; i<9; i++) {
            auxJogos[i+1] = this.jogosAnteriores[i];
            auxData[i+1] = this.dataDoJogo[i];
        }
        for (int i = 0; i<10; i++) {
            this.jogosAnteriores[i] = auxJogos[i];
            this.dataDoJogo[i] = auxData[i];
        }
    }

    public int getQuantidadeJogos() {
        return quantidadeJogos;
    }

    public void setQuantidadeJogos(double quantidadeJogos) {
        this.quantidadeJogos += quantidadeJogos;
    }
    
    public boolean jaJogou() {
        for (int i = 0; i<10; i++) {
            if (this.jogosAnteriores[i] != null) {
                return true;
            }
        }
        return false;
    }

    public int getSomaPontuacao() {
        return somaPontuacao;
    }

    public void setSomaPontuacao(int somaPontuacao) {
        this.somaPontuacao = this.somaPontuacao + somaPontuacao;
    }
}
