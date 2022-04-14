package Controller;

import service.finallyCash;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/finallyCashController.do")
public class finallyCashController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Type = req.getParameter("Type");
        int totalPrice= Integer.parseInt(req.getParameter("totalPrice"));
        double result= finallyCash.discount(Type,totalPrice);

        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println(result);
    }
}
