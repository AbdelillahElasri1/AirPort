package com.abdelillahelasri.airport;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/routing-servlets")
public class RoutingServlets extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String route = req.getParameter("route");
        if (route != null) {
            String targetJsp= null;
            switch (route){
                case "home":
                    targetJsp = "/index.jsp";
//                    req.getRequestDispatcher("/index.jsp").forward(req,resp);
                    break;
                case "ticket":
                    targetJsp = "tickets.jsp";
//                    req.getRequestDispatcher("/tickets.jsp").forward(req,resp);
                    break;
                case "contact":
                    targetJsp = "contactUs.jsp";
//                    req.getRequestDispatcher("/contactUs.jsp").forward(req,resp);
                    break;
                case "booking":
                    targetJsp = "flightBooking.jsp";
//                    req.getRequestDispatcher("/flightBooking.jap").forward(req,resp);
                    break;
                default:
                    resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Route Not Found");
            }
            if (targetJsp != null){
                req.getRequestDispatcher(targetJsp).forward(req,resp);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "route Parameter missing");
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
