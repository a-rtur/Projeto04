package servlets;

import classesDoProjeto.Banco;
import classesDoProjeto.Jogadores;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String nome = request.getParameter("txtNome");
        if (Banco.isRegistered(nome) == true) {
            session.setAttribute("nome", nome);
        }
        else {
            session.setAttribute("nome", nome);
            Jogadores j = new Jogadores(nome);
            Banco.getJogadores().add(j);
        }
        response.sendRedirect(request.getContextPath() + "/home.jsp");
    }
}
