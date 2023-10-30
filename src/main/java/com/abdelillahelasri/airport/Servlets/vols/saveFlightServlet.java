package com.abdelillahelasri.airport.Servlets.vols;

import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.services.Impl.VolServiceImpl;
import com.abdelillahelasri.airport.services.VolService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "saveFlight", urlPatterns = "/saveFlight")
public class saveFlightServlet extends HttpServlet {
    private VolService volService;
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Vol vol = new Vol();
        String datedepart = req.getParameter("datedepart");
        String datearrivee = req.getParameter("datearrivee");
        String heuredepart = req.getParameter("heuredepart");
        String heurearrivee = req.getParameter("heurearrivee");
        String nombreplacesdisponible = req.getParameter("nombreplacesdisponible");
        String villedepart = req.getParameter("villedepart");
        String villearrivee = req.getParameter("villearrivee");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date datededepart = dateFormat.parse(datedepart);
            Date  datedarrive = dateFormat.parse(datearrivee);


        vol.setVilleDepart(villedepart);
        vol.setVilleArrivee(villearrivee);
        vol.setHeureDepart(heuredepart);
        vol.setHeureArrivee(heurearrivee);
        vol.setDateDepart(datededepart);
        vol.setDateArrivee(datedarrive);
        vol.setNombrePlacesDisponibles(Integer.parseInt(nombreplacesdisponible));
        vol.setNumeroVol("120");
        volService.save(vol);
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
