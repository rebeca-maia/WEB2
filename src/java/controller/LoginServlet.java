package controller;

import general.Configs;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        super();
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(Configs.getMainUrl() + "login.jsp");
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Captura dos dados
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        // Validação dos dados
        String msgError = "";
        if (email.equals("") || pass.equals("")) {

            msgError += "O campo email e senha são obrigatórios.";

        } else if (!email.equals("teste@gmail.com") || !pass.equals("123")) {

            msgError += "Email ou senha estão inválidos!";

            /*if (userDAO.login(username, password) == false) {
                msgError += "Email ou senha estão inválidos!";
            }*/
        }

        if (msgError.length() > 0) {
            request.setAttribute("msgError", msgError);
        }

        try {
            if (msgError.length() == 0) {

                HttpSession session = request.getSession();
                session.setAttribute("id", 1);
                session.setAttribute("nome", "Albert Einstein");
                session.setAttribute("email", email);

                response.sendRedirect(Configs.getMainUrlHome());

            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            }

        } catch (IOException | ServletException e) {
            response.sendRedirect(Configs.getMainUrl() + "login.jsp");
        }
    }
}
