package travelAgency.city.repo;

import java.util.List;
import travelAgency.city.domain.City;
import travelAgency.city.search.CitySearchCondition;
import travelAgency.common.solutions.repo.BaseRepo;

public interface CityRepo extends BaseRepo<City, Long> {

    List<? extends City> search(CitySearchCondition searchCondition);
}
