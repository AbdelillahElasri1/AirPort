package com.abdelillahelasri.airport;

import com.abdelillahelasri.airport.DAO.VolDao;
import com.abdelillahelasri.airport.DAO.impl.VolDaoImpl;
import com.abdelillahelasri.airport.entites.Vol;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    public static void main(String[] args) throws ParseException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("start test");
        Vol vol = new Vol();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date datedepart = dateFormat.parse("2023-10-31");

        vol.setId(12L);
        vol.setNumeroVol(String.valueOf(123L));
        vol.setDateDepart(datedepart);
        vol.setDateArrivee(datedepart);
        vol.setHeureDepart("13:15:00");
        vol.setHeureArrivee("11:15:00");
        vol.setVilleDepart("Casablanca");
        vol.setVilleArrivee("Berlin");
        vol.setNombrePlacesDisponibles(1230);
        vol.setAdmin(vol.getAdmin());
        // Use persist to manage the entity
        entityManager.persist(vol);
        System.out.println("end test");
        entityManager.getTransaction().commit();
         entityManager.close();
         entityManagerFactory.close();


    }
    public static Boolean saveFlight() throws ParseException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        // Wrap the following code in a try-catch block to handle exceptions
        try {
            entityManager.getTransaction().begin();

            Vol vol = new Vol();
            VolDao volDao = new VolDaoImpl();

            System.out.println("test saved flight");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date datedepart = dateFormat.parse("2023-10-31");

            vol.setId(12L);
            vol.setNumeroVol(String.valueOf(123L));
            vol.setDateDepart(datedepart);
            vol.setDateArrivee(datedepart);
            vol.setHeureDepart("13:15:00");
            vol.setHeureArrivee("11:15:00");
            vol.setVilleDepart("Casablanca"); // Changed "lhmadna" to "Casablanca"
            vol.setVilleArrivee("Berlin");
            vol.setNombrePlacesDisponibles(1230);
            vol.setAdmin(vol.getAdmin());
            // Use persist to manage the entity
            volDao.save(vol);

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions appropriately
            entityManager.getTransaction().rollback(); // Rollback the transaction on error
            return false; // Return false in case of an error
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }
    public void saveReservation(){

    }

}