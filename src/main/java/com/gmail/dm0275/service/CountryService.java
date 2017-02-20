package com.gmail.dm0275.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.dm0275.dao.CountryDAO;
import com.gmail.dm0275.model.Country;

/**
 * Created by dmancilla on 2/20/2017.
 */
@Service("countryService")
public class CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Transactional
    public void addCountry(final Country country) {
        countryDAO.addCountry(country);
    }

    @Transactional
    public void deleteCountry(final int id) {
        countryDAO.deleteCountry(id);
    }

    @Transactional
    public List<Country> getAllCountries() {
        return countryDAO.getAllCountries();
    }

    @Transactional
    public Country getCountry(final int id) {
        return countryDAO.getCountry(id);
    }

    @Transactional
    public void updateCountry(final Country country) {
        countryDAO.updateCountry(country);
    }
}

