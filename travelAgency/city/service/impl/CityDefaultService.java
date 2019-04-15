package travelAgency.city.service.impl;

import static travelAgency.city.exception.CityExceptionMeta.DELETE_CITY_CONSTRAINT_ERROR;

import java.util.List;
import travelAgency.city.domain.City;
import travelAgency.city.exception.unchecked.DeleteCityException;
import travelAgency.city.repo.CityRepo;
import travelAgency.city.search.CitySearchCondition;
import travelAgency.city.service.CityService;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;
import travelAgency.order.repo.OrderRepo;

public class CityDefaultService implements CityService {

    private final CityRepo cityRepo;
    private final OrderRepo orderRepo;

    public CityDefaultService(CityRepo modelRepo, OrderRepo orderRepo) {
        this.cityRepo = modelRepo;
        this.orderRepo = orderRepo;
    }

    @Override
    public void insert(City city) {
        if (city != null) {
            cityRepo.insert(city);
        }
    }

    @Override
    public City findById(Long id) {
        if (id != null) {
            return cityRepo.findById(id);
        } else {
            return null;
        }
    }

    @Override
    public void delete(City city) {
        if (city.getId() != null) {
            this.deleteById(city.getId());
        }
    }

    @Override
    public void deleteById(Long id) throws TravelAgencyUncheckedException {
        if (id != null) {

            boolean noOrders = orderRepo.countByModel(id) == 0;
            if (noOrders) {
                cityRepo.deleteById(id);
            } else {
                throw new DeleteCityException(DELETE_CITY_CONSTRAINT_ERROR);
            }

        }
    }

    @Override
    public void printAll() {
        cityRepo.printAll();
    }

    @Override
    public List<? extends City> search(CitySearchCondition searchCondition) {
        return cityRepo.search(searchCondition);
    }

    @Override
    public void update(City city) {
        if (city.getId() != null) {
            cityRepo.update(city);
        }
    }

    @Override
    public List<City> findAll() {
        return cityRepo.findAll();
    }
}
