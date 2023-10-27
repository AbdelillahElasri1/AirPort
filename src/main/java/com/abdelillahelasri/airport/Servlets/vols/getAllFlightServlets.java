package com.abdelillahelasri.airport.Servlets.vols;

import com.abdelillahelasri.airport.DAO.impl.VolDaoImpl;
import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.services.Impl.VolServiceImpl;
import com.abdelillahelasri.airport.services.VolService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "getAllFlight", urlPatterns = {"/allF"})
public class getAllFlightServlets extends HttpServlet {

    private VolService volService;
    @Override
    public void init() throws ServletException {
        super.init();
        volService = new VolServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        List<Vol> volList = volService.getAll();
        req.setAttribute("vols", volList);
        req.getRequestDispatcher("/allFlight.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
