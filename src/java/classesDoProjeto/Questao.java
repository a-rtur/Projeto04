
package classesDoProjeto;


public class Questao {
    private String pergunta ;
    private boolean resposta;
    private boolean alternativa[];

    public Questao(String pergunta, boolean resposta, boolean [] alternativa) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.alternativa = alternativa;
    }
    
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public boolean getResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public boolean [] getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(boolean [] alternativa) {
        this.alternativa = alternativa;
    }
    
    
}
