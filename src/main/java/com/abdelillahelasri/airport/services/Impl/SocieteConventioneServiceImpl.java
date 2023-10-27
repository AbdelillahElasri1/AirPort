package com.abdelillahelasri.airport.services.Impl;

import com.abdelillahelasri.airport.DAO.SocieteConventioneDoa;
import com.abdelillahelasri.airport.DAO.impl.SocieteComventioneDaoImpl;
import com.abdelillahelasri.airport.entites.SocieteConventione;
import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.services.SocieteConventioneService;

import java.util.List;

public class SocieteConventioneServiceImpl implements SocieteConventioneService {
    private final SocieteConventioneDoa societeConventioneDoa = new SocieteComventioneDaoImpl();
    @Override
    public SocieteConventione save(SocieteConventione societeConventione) {
        if (societeConventioneDoa.save(societeConventione) != null){
            return societeConventione;
        }else {
            return null;
        }
    }

    @Override
    public SocieteConventione update(SocieteConventione societeConventione) {
        if (societeConventioneDoa.update(societeConventione) != null){
            return societeConventione;
        }else {
            return null;
        }
    }

    @Override
    public void delete(int id) {
        societeConventioneDoa.delete(id);
    }

    @Override
    public SocieteConventione getOne(int id) {
        SocieteConventione societeConventione = societeConventioneDoa.getOne(id);
        if (societeConventione != null){
            return societeConventione;
        } else {
            return null;
        }
    }

    @Override
    public List<SocieteConventione> getAll() {
        List<SocieteConventione> societeConventioneList = societeConventioneDoa.getAll();
        if (societeConventioneList != null){
            return societeConventioneList;
        } else  {
            return null;
        }
    }
}
