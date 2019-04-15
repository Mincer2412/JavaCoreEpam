package travelAgency.country.repo.impl.memory;


import static travelAgency.storage.Storage.countriesList;

import java.util.ArrayList;
import java.util.List;
import travelAgency.country.domain.Country;
import travelAgency.country.repo.CountryRepo;
import travelAgency.country.serach.CountrySearchCondition;
import travelAgency.storage.SequenceGenerator;

public class CountryCollectionRepo implements CountryRepo {

    @Override
    public void insert(Country country) {
        country.setId(SequenceGenerator.getNextValue());
        countriesList.add(country);
    }

    @Override
    public void update(Country country) {
        //we already in memory, no need to update object
    }

    @Override
    public Country findById(Long id) {
        return findCountryById(id);
    }

    @Override
    public void deleteById(Long id) {
        Country country = findCountryById(id);

        if (country != null) {
            countriesList.remove(country);
        }
    }



    @Override
    public void printAll() {
        for (Country country : countriesList) {
            System.out.println(country);
        }
    }

    @Override
    public List<Country> findAll() {
        return countriesList;
    }

    @Override
    public List<Country> search(CountrySearchCondition searchCondition) {
        return null;
    }

    private Country findCountryById(long countryId) {
        for (Country country : countriesList) {
            if (Long.valueOf(countryId).equals(country.getId())) {
                return country;
            }
        }
        return null;
    }

    private List<Country> doSearch(CountrySearchCondition searchCondition) {
        List<Country> result = new ArrayList<>();
        for (Country country : countriesList) {
            if (country != null) {
                boolean found = true;

                if (searchCondition.searchByName()) {
                    found = searchCondition.getName().equals(country.getName());
                }

                if (found && searchCondition.searchBySquare()) {
                    found = searchCondition.getSquare().equals(country.getSquare());
                }

                if (found) {
                    result.add(country);
                }
            }
        }
        return result;
    }
}
