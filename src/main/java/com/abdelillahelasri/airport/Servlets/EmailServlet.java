package com.abdelillahelasri.airport.Servlets;

import com.abdelillahelasri.airport.services.Impl.EmailService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String to = req.getParameter("to");
//        String subject = req.getParameter("subject");
//        String message = req.getParameter("message");

        EmailService emailService = new EmailService();

        try {
            emailService.sendEmail(to);
            resp.getWriter().println("Email sent successfully!");
        } catch (Exception e) {
            resp.getWriter().println("Failed to send email" + e.getMessage());
        }
    }
}
