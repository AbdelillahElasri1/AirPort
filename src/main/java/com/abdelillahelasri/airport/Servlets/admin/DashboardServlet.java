package com.abdelillahelasri.airport.Servlets.admin;

import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.services.Impl.VolServiceImpl;
import com.abdelillahelasri.airport.services.VolService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "dashboard", urlPatterns = "/dashboard")
public class DashboardServlet extends HttpServlet {
    private VolService volService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        List<Vol> volList = volService.getAll();
        req.setAttribute("volList", volList);
        req.getRequestDispatcher("/Dashboard.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        volService = new VolServiceImpl();
    }
}
