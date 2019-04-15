package travelAgency.city.search;

import travelAgency.city.domain.CityDiscriminator;
import travelAgency.common.buisness.search.BaseSearchCondition;

public class CitySearchCondition extends BaseSearchCondition<Long> {
    private CityDiscriminator cityDiscriminator;

    public CityDiscriminator getCityDiscriminator() {
        return cityDiscriminator;
    }

    public void setCityDiscriminator(CityDiscriminator cityDiscriminator) {
        this.cityDiscriminator = cityDiscriminator;
    }
}
