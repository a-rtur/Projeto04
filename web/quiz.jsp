<%@page import="data.Data"%>
<%@page import="rankings.*"%>
<%@page import="quiz.*" %>
<%@page import="jogadores.*"%>
<%@page import="java.util.Collections"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="assets/css/style.css"/>
    </head>
    <body>
        <%
            if (session.getAttribute("nome") != null) {
        %>
        <%@include file="WEB-INF/jspf/menuLogado.jspf" %>
        <%
        } else {
        %>
        <%@include file="WEB-INF/jspf/menuDeslogado.jspf" %>
        <%
            }
        %>
        <%
            // Não permitir que cache seja salvo(botão voltar).
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0
            response.setHeader("Expires", "0"); // Proxy
            if (session.getAttribute("nome") != null) {
        %>
        <div id="conteudo">
            <%
                if (request.getParameter("finalizar") != null) {
                    int acertos = 0;
                    for (int x = 0; x < 10; x++) {
                        Questao p = BancoQuestoes.getQuestoes().get(x);
                        String resposta = request.getParameter(p.getIdPergunta());
                        if (resposta != null) {
                            if (resposta.equals(p.getResposta())) {
                                acertos++;
                            }
                        }
                    }
                    // Pegar o index do jogador no Banco pelo nome(único) dele.
                    int pos = BancoJogadores.indexByName(session.getAttribute("nome").toString());
                    // Adicionar informações do jogador no arrayList.
                    BancoJogadores.getJogadores().get(pos).setQuantidadeJogos(1);
                    BancoJogadores.getJogadores().get(pos).setJogosAnteriores(acertos);
                    // Adicionar informações do jogo no ranking geral.
                    Ranking r = new Ranking(session.getAttribute("nome").toString(), acertos, Data.retornarData());
                    BancoRanking.getRankingGeral().add(r);
                    // Redirecionar para home e enbaralhar arrayList do quiz.
                    response.sendRedirect(request.getContextPath() + "/home.jsp");
                    Collections.shuffle(BancoQuestoes.getQuestoes());
                }

            %>

            <form>
                <%for (int i = 0; i < 10; i++) {
                        Questao p = BancoQuestoes.getQuestoes().get(i);
                %>
                <h3>Questão <%=i + 1%>:</h3>
                <h4><%=p.getPergunta()%></h4>
                <input type="radio" name="<%=p.getIdPergunta()%>"
                       value="V"/>
                <%="Verdadeiro"%>       
                <input type="radio" name="<%=p.getIdPergunta()%>"
                       value="F"/>
                <%="Falso"%>           
                <br/>
                <br/>
                <%}%>
                <br/>
                <input type="submit" name="finalizar" value="Finalizar"/>
            </form>  
        </div>
        <%
            } else {
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            }
        %>
        <%@include file="WEB-INF/jspf/rodape.jspf" %>
    </body>
</html>
