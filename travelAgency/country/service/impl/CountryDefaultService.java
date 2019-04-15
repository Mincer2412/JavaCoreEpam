package travelAgency.country.service.impl;

import static travelAgency.country.exception.CountryExceptionMeta.DELETE_COUNTRY_CONSTRAINT_ERROR;

import java.util.*;
import travelAgency.city.domain.City;
import travelAgency.city.service.CityService;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;
import travelAgency.country.domain.Country;
import travelAgency.country.exception.unchecked.DeleteCountryException;
import travelAgency.country.repo.CountryRepo;
import travelAgency.country.serach.CountrySearchCondition;
import travelAgency.country.service.CountryService;
import travelAgency.order.repo.OrderRepo;


public class CountryDefaultService implements CountryService {

    private final CountryRepo countryRepo;
    private final CityService cityService;
    private final OrderRepo orderRepo;


    public CountryDefaultService(CountryRepo countryRepo,
        CityService cityService, OrderRepo orderRepo) {
        this.countryRepo = countryRepo;
        this.cityService = cityService;
        this.orderRepo = orderRepo;
    }

    @Override
    public List<Country> search(CountrySearchCondition searchCondition) {
        return countryRepo.search(searchCondition);
    }

    @Override
    public void removeAllCitiesFromCountry(Long countryId) throws TravelAgencyUncheckedException {
        Country country = findById(countryId);
        if (country != null) {
            List<City> cities = country.getCities() == null ? Collections.emptyList() : country.getCities();

            for (City city : cities) {
                countryRepo.deleteById(city.getId());
            }

        }
    }

    @Override
    public void insert(Country country) {
        if ( country != null) {
            countryRepo.insert(country);

            if (country.getCities() != null) {
                for (City city : country.getCities()) {
                    if (city != null) {
                        cityService.insert(city);
                    }
                }
            }
        }
    }

    @Override
    public void update(Country country) {
        if (country.getId() != null) {
            countryRepo.update(country);
        }

    }

    @Override
    public Country findById(Long id) {
        if (id != null) {
            return countryRepo.findById(id);
        } else {
            return null;
        }

    }

    @Override
    public void deleteById(Long id) throws TravelAgencyUncheckedException {
        if (id != null) {
            boolean noOrders = orderRepo.countByMark(id) == 0;

            if (noOrders) {
                removeAllCitiesFromCountry(id);
                countryRepo.deleteById(id);
            } else {
                throw new DeleteCountryException(DELETE_COUNTRY_CONSTRAINT_ERROR);
            }
        }
    }

    @Override
    public void delete(Country country) {
        if (country != null) {
            this.deleteById(country.getId());
        }
    }

    @Override
    public void printAll() {
        countryRepo.printAll();
    }

    @Override
    public List<Country> findAll() {
        return countryRepo.findAll();
    }
}
