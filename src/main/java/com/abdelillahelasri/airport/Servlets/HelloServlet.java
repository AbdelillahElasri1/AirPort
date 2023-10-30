package com.abdelillahelasri.airport.Servlets;

import java.io.*;
import java.util.List;

import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.services.Impl.VolServiceImpl;
import com.abdelillahelasri.airport.services.VolService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/home")
public class HelloServlet extends HttpServlet {
    private VolService volService;


    public void init() {
       volService = new VolServiceImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Vol> volList = volService.getAll();
        request.setAttribute("volList", volList);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}