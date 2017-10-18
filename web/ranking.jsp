<%@page import="rankings.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ranking Geral</title>
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
            }
            else {
        %>
        <%@include file="WEB-INF/jspf/menuDeslogado.jspf" %>
        <%        
            }
        %>
        <div id="conteudo">
        <%
            if (BancoRanking.getRankingGeral().size() == 0) {
        %>
            <h3>Não há nada aqui. Faça login e seja o primeiro a jogar!</h3>
        <%        
            }
            else {
        %>
            <h1>Ranking Geral</h1><br/>
            <table border="1" align="center" >
                <tr>
                    <th>Posição</th>
                    <th>Jogador</th>
                    <th>Pontuação</th>
                    <th>Data</th>
                </tr> 
        <%
                int cont = 1;
                for (int i = BancoRanking.getRankingGeral().size()-1; i>=0; i--) {
        %>
                <tr>
                    <td><%=cont%></td>
                    <td><%=BancoRanking.getRankingGeral().get(i).getNome()%></td>
                    <td><%=BancoRanking.getRankingGeral().get(i).getResultado()%></td>
                    <td><%=BancoRanking.getRankingGeral().get(i).getData()%></td>
                </tr> 
        <%  
                    cont ++;
                }
        %>
            </table>
        <%
            }
        %>
        </div>
        <%@include file="WEB-INF/jspf/rodape.jspf" %>
    </body>
</html>
