package travelAgency.country.service;

import java.util.List;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;
import travelAgency.common.solutions.service.BaseService;
import travelAgency.country.domain.Country;
import travelAgency.country.serach.CountrySearchCondition;

public interface CountryService extends BaseService<Country, Long> {

    List<Country> search(CountrySearchCondition searchCondition);

    void removeAllCitiesFromCountry(Long countryId) throws TravelAgencyUncheckedException;

}
