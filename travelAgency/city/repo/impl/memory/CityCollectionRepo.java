package travelAgency.city.repo.impl.memory;

import static travelAgency.storage.Storage.citiesList;

import java.util.*;
import travelAgency.city.domain.City;
import travelAgency.city.domain.CityDiscriminator;
import travelAgency.city.domain.MillionaireCity;
import travelAgency.city.domain.NotMillionaireCity;
import travelAgency.city.repo.CityRepo;
import travelAgency.city.search.CitySearchCondition;
import travelAgency.city.search.MillionaireCitySearchCondition;
import travelAgency.city.search.NotMillionaireSearchCondition;
import travelAgency.storage.SequenceGenerator;

public class CityCollectionRepo implements CityRepo {

    @Override
    public void insert(City city) {
        city.setId(SequenceGenerator.getNextValue());
        citiesList.add(city);
    }

    @Override
    public City findById(Long id) {
        return findCityById(id);
    }

    @Override
    public void update(City city) {
        //we already in memory, no need to update object
    }


    @Override
    public List<? extends City> search(CitySearchCondition searchCondition) {

        CityDiscriminator cityDiscriminator = searchCondition.getCityDiscriminator();

        switch (cityDiscriminator) {
            case MILLIONAIRE: {
                return searchMillionaireCity((MillionaireCitySearchCondition) searchCondition);
            }
            case NOT_MILLIONAIRE: {
                return searchNotMillionaireCity((NotMillionaireSearchCondition) searchCondition);
            }
            default: {
                return citiesList;
            }
        }
    }

    private List<MillionaireCity> searchMillionaireCity(
        MillionaireCitySearchCondition searchCondition) {
        List<MillionaireCity> result = new ArrayList<>();

        for (City city : citiesList) {

            if (CityDiscriminator.MILLIONAIRE.equals(city.getDiscriminator())) {
                MillionaireCity millionaireCity = (MillionaireCity) city;

                boolean found = true;

                if (searchCondition.searchByMajorName()) {
                    found = searchCondition.getMajorName().equals(millionaireCity.getMajorName());
                }

                if (found && searchCondition.searchByNumberofDistricts()) {
                    found = searchCondition.getNumberOfDistricts()
                        .equals(millionaireCity.getNumberOfDistricts());
                }

                if (found && searchCondition.searchBySquare()) {
                    found = searchCondition.getSquare().equals(millionaireCity.getSquare());
                }

                if (found) {
                    result.add(millionaireCity);
                }
            }

        }

        return result;
    }

    private List<NotMillionaireCity> searchNotMillionaireCity(NotMillionaireSearchCondition searchCondition) {
        List<NotMillionaireCity> result = new ArrayList<>();

        for (City city : citiesList) {

            if (CityDiscriminator.NOT_MILLIONAIRE.equals(city.getDiscriminator())) {
                NotMillionaireCity notMillionaireCity = (NotMillionaireCity) city;

                boolean found = true;
                if (searchCondition.searchByHeadName()) {
                    found = searchCondition.getHeadName()
                        .equals(notMillionaireCity.getHeadName());
                }

                if (found && searchCondition.searchByNumberOfVillages()) {
                    found = searchCondition.getNumberOfVillages()
                        .equals(notMillionaireCity.getNumberOfVillages());
                }

                if (found && searchCondition.searchByDistrictName()) {
                    found = searchCondition.getDistrictName()
                        .equals(notMillionaireCity.getNumberOfVillages());
                }

                if (found) {
                    result.add(notMillionaireCity);
                }
            }

        }

        return result;
    }

    @Override
    public void deleteById(Long id) {
        City found = findCityById(id);

        if (found != null) {
            citiesList.remove(found);
        }
    }

    @Override
    public void printAll() {
        for (City city : citiesList) {
            System.out.println(city);
        }
    }

    private City findCityById(long cityId) {
        for (City city : citiesList) {
            if (Long.valueOf(cityId).equals(city.getId())) {
                return city;
            }
        }
        return null;
    }

    @Override
    public List<City> findAll() {
        return citiesList;
    }

}
