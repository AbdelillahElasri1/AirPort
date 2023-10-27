package com.abdelillahelasri.airport.services.Impl;

import com.abdelillahelasri.airport.DAO.ExtraDao;
import com.abdelillahelasri.airport.entites.Extras;
import com.abdelillahelasri.airport.services.ExtraService;
import jakarta.inject.Inject;

import java.util.List;

public class ExtraServiceImpl implements ExtraService {
    @Inject
    private ExtraDao extraDao;
    @Override
    public Extras save(Extras Extras) {
        if (extraDao.save(Extras) != null){
            return Extras;
        } else {
            return null;
        }
    }

    @Override
    public Extras update(Extras Extras) {
        if (extraDao.update(Extras) != null){
            return Extras;
        }else {
            return null;
        }
    }

    @Override
    public void delete(int id) {
        extraDao.delete(id);
    }

    @Override
    public Extras getOne(int id) {
        Extras Extras = extraDao.getOne(id);
        if (Extras != null){
            return Extras;
        } else {
            return null;
        }
    }

    @Override
    public List<Extras> getAll() {
        List<Extras> ExtrasList = extraDao.getAll();
        if (ExtrasList != null){
            return ExtrasList;
        } else {
            return null;
        }
    }
}
