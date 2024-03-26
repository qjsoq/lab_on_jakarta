import com.example.labwork4vol1.Data;
import com.example.labwork4vol1.Firm;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Controller", value = "/Controller")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Data data = new Data();
            data.set();
            Firm asco = new Firm("Asco",data.getDirMain(),data.getDepartments());
            getServletContext().setAttribute("asco",asco);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("WEB-INF/view.jsp").forward(request,response);
    }
}
