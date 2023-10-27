package com.abdelillahelasri.airport.Servlets.societeConventione;

import com.abdelillahelasri.airport.entites.SocieteConventione;
import com.abdelillahelasri.airport.services.Impl.SocieteConventioneServiceImpl;
import com.abdelillahelasri.airport.services.SocieteConventioneService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "getAllCompany", urlPatterns = {"/getAllCompany"})
public class GetAllServlet extends HttpServlet {
    private SocieteConventioneService societeConventioneService;
    @Override
    public void init() throws ServletException {
        super.init();
        societeConventioneService = new SocieteConventioneServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        List<SocieteConventione> societeConventioneList = societeConventioneService.getAll();
        req.setAttribute("societeConventioneList", societeConventioneList);
        req.getRequestDispatcher("/companiesList.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
