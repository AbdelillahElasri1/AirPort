package com.abdelillahelasri.airport.services.Impl;

import com.abdelillahelasri.airport.DAO.VolDao;
import com.abdelillahelasri.airport.DAO.impl.VolDaoImpl;
import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.services.VolService;
import jakarta.inject.Inject;

import java.util.List;

public class VolServiceImpl implements VolService {

    private final VolDao volDao = new VolDaoImpl();


    public VolServiceImpl() {
    }

    @Override
    public Vol save(Vol Vol) {
        if (volDao.save(Vol) != null){
            return Vol;
        } else {
            return null;
        }
    }

    @Override
    public Vol update(Vol Vol) {
        if (volDao.update(Vol) != null){
            return Vol;
        } else {
            return null;
        }
    }

    @Override
    public void delete(int id) {
        volDao.delete(id);
    }

    @Override
    public Vol getOne(int id) {
        Vol Vol = volDao.getOne(id);
        if (Vol != null){
            return Vol;
        } else {
            return null;
        }
    }

    @Override
    public List<Vol> getAll() {
        List<Vol> Vols = volDao.getAll();
        if (Vols != null){
            return Vols;
        } else  {
            return null;
        }
    }
}
