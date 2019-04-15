package travelAgency.order.search;

import travelAgency.common.buisness.search.BaseSearchCondition;

public class OrderSearchCondition extends BaseSearchCondition<Long> {

    private Long cityId;
    private Long countryId;
    private Long userId;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public boolean searchByCityId(){
        return cityId != null;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public boolean searchByCountryId(){
        return countryId != null;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean searchbyUserId() {
        return userId != null;
    }
}
