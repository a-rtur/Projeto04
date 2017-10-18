<%@page import="global.FormatoDecimal"%>
<%@page import="jogadores.BancoJogadores"%>
<%@page import="quiz.BancoQuestoes"%>
<%@page import="quiz.Questao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html" charset=utf-8" />
        <title>Home</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="assets/css/style.css"/>
   <style>
table {
    border-collapse: collapse;
    width: 60%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #e6ccff}

th {
    background-color: #A020F0;
    color: white;
}
</style>
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
        <div id="conteudo">
        <%
                if (session.getAttribute("nome") != null) {
                    int pos = BancoJogadores.indexByName(session.getAttribute("nome").toString());
        %>
            <h1>Bem-vindo <%=BancoJogadores.getJogadores().get(pos).getNome()%></h1><br/>
            <h3>Testes realizados: <%=BancoJogadores.getJogadores().get(pos).getQuantidadeJogos()%></h3>
        <%
                    if (BancoJogadores.getJogadores().get(pos).getMediaJogos() != 0.0) {
        %>    
        <h3>Pontuação média: <%=FormatoDecimal.duasCasas(BancoJogadores.getJogadores().get(pos).getMediaJogos())%></h3>
        <%                
                    }
                    if (BancoJogadores.getJogadores().get(pos).jaJogou() == true) {
        %>
            <br/>
            <br/>
            <h2>Resultados recentes</h2><br/>
            <table border="1" align="center">
                <tr>
                    <th>Data</th>
                    <th>Pontuação</th>
                </tr>
        <%
                        for (int i=0; i<10; i++) {
                            if (BancoJogadores.getJogadores().get(pos).getJogosAnteriores(i) != null) {
        %>
                <tr>
                    <td><%=BancoJogadores.getJogadores().get(pos).getDataDoJogo(i)%></td>
                    <td><%=BancoJogadores.getJogadores().get(pos).getJogosAnteriores(i)%></td>
                </tr>
        <%
                            }
                        }
        %>
            </table>
        <% 
                    }
                } 
                else {
        %>
            <h3>Bem-vindo, efetue login para poder jogar, e acessar seu perfil!</h3>
        <%
                }
        %>
        </div>
        <%@include file="WEB-INF/jspf/rodape.jspf" %>
    </body>
</html>