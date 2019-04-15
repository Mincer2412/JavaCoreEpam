package travelAgency.country.repo;


import java.util.List;
import travelAgency.common.solutions.repo.BaseRepo;

import travelAgency.country.domain.Country;
import travelAgency.country.serach.CountrySearchCondition;

public interface CountryRepo extends BaseRepo<Country, Long> {

    List<Country> search(CountrySearchCondition searchCondition);

}
