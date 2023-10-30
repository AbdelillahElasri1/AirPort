package com.abdelillahelasri;

import com.abdelillahelasri.airport.DAO.VolDao;
import com.abdelillahelasri.airport.DAO.impl.VolDaoImpl;
import com.abdelillahelasri.airport.entites.Vol;
import jakarta.persistence.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class VolDaoImplTest {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction transaction;
    private VolDao volDao;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("default");
                 em = emf.createEntityManager();
        transaction = em.getTransaction();
        volDao = new VolDaoImpl(); // Initialize your VolDao implementation
    }

    @After
    public void tearDown() {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

    @Test
    public void testSave() {
        Vol vol = new Vol();
        // Set properties of vol
        transaction.begin();
        Vol savedVol = volDao.save(vol);
        transaction.commit();

        assertNotNull(savedVol.getId()); // Ensure that the ID is generated
        // You can also query the database to check if the Vol was saved correctly
    }

    @Test
    public void testUpdate() {
        Vol vol = new Vol();
        // Set properties of vol and save it first
        transaction.begin();
        Vol savedVol = volDao.save(vol);
        transaction.commit();

        // Update properties of savedVol
        transaction.begin();
        Vol updatedVol = volDao.update(savedVol);
        transaction.commit();

        // Query the database to check if the Vol was updated correctly
        assertEquals(updatedVol.getId(), savedVol.getId());
        // Add additional assertions to check for specific updates
    }

    @Test
    public void testDelete() {
        Vol vol = new Vol();
        // Set properties of vol and save it
        transaction.begin();
        Vol savedVol = volDao.save(vol);
        transaction.commit();

        transaction.begin();
        volDao.delete(Math.toIntExact(savedVol.getId()));
        transaction.commit();

        // Query the database to check if the Vol was deleted
        Vol deletedVol = volDao.getOne(Math.toIntExact(savedVol.getId()));
        assertNull(deletedVol); // The Vol should not exist
    }

    @Test
    public void testGetOne() {
        Vol vol = new Vol();
        // Set properties of vol and save it
        transaction.begin();
        Vol savedVol = volDao.save(vol);
        transaction.commit();

        Vol retrievedVol = volDao.getOne(Math.toIntExact(savedVol.getId()));
        // Check if the retrieved Vol matches the one saved
        assertEquals(savedVol.getId(), retrievedVol.getId());
        // Add additional assertions to check for specific properties
    }

    @Test
    public void testGetAll() {
        // Save multiple Vol instances
        List<Vol> savedVols = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Vol vol = new Vol();
            // Set properties of vol and save it
            transaction.begin();
            savedVols.add(volDao.save(vol));
            transaction.commit();
        }

        List<Vol> retrievedVols = volDao.getAll();
        // Check if the list of retrieved Vols matches the list of saved Vols
        assertEquals(savedVols.size(), retrievedVols.size());
        // Add additional assertions to check for specific Vols
    }
}