
package quiz;


public class Questao {
    private String idPergunta;
    private String pergunta ;
    private String resposta;

    public Questao(String idPergunta,String pergunta, String resposta) {
        this.idPergunta = idPergunta;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(String idPergunta) {
        this.idPergunta = idPergunta;
    }
    
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    } 
}
