package Controller;

import service.calculateMoney;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/moneyController.do")
public class moneyController extends HttpServlet {
    calculateMoney calculateM=new calculateMoney();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double price = Double.parseDouble(req.getParameter("oneMoney"));
        int count = Integer.parseInt(req.getParameter("count"));
        double total=calculateM.calculate(price,count);
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println(String.valueOf(total));
    }
}
