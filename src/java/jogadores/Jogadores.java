package jogadores;

import data.Data;
import global.FormatoDecimal;

public class Jogadores {
    private String nome;
    private int quantidadeJogos;
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
        if (jaJogou() == true) {
           double acumulador = 0, media = 0;
            for(int i = 0; i<10; i++) {
                if (this.jogosAnteriores[i] != null) {
                    acumulador += Integer.parseInt(this.jogosAnteriores[i]); 
                }
            }
            media = acumulador/quantidadeJogos;
            return media;
        }
        return 0;
    }

    public String getJogosAnteriores(int index) {
        return this.jogosAnteriores[index];
    }
    
    public String getDataDoJogo(int index) {
        return this.dataDoJogo[index];
    }

    public void setJogosAnteriores(int acertos) {
        for (int i = 0; i<10; i++) {
            if (this.jogosAnteriores[i] == null) {
                jogosAnteriores[i] = Integer.toString(acertos);
                dataDoJogo[i] = Data.retornarData();
                break;
            }
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
}
