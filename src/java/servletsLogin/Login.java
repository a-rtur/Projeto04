package servletsLogin;

import jogadores.BancoJogadores;
import jogadores.Jogadores;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String nome = request.getParameter("txtNome");
        if (BancoJogadores.isRegistered(nome) == true) {
            HttpSession session = request.getSession();
            session.setAttribute("nome", nome);
        }
        else {
            HttpSession session = request.getSession();
            session.setAttribute("nome", nome);
            Jogadores j = new Jogadores(nome);
            BancoJogadores.getJogadores().add(j);
        }
        response.sendRedirect(request.getContextPath() + "/home.jsp");
    }
}
