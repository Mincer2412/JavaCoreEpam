package travelAgency.city.service;

import java.util.List;
import travelAgency.city.domain.City;
import travelAgency.city.search.CitySearchCondition;
import travelAgency.common.solutions.service.BaseService;

public interface CityService extends BaseService<City, Long> {

    List<? extends City> search(CitySearchCondition searchCondition);
}
