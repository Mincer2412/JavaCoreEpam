package travelAgency.country.serach;

import static travelAgency.common.solutions.utils.StringUtils.isNotBlank;

import travelAgency.common.buisness.search.BaseSearchCondition;

public class CountrySearchCondition extends BaseSearchCondition<Long> {

    private String name;
    private Double square;
    private CountryOrderByField countryOrderByField;

    public boolean searchByName() {
        return isNotBlank(name);
    }

    public boolean searchBySquare() {
        return square > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public CountryOrderByField getCountryOrderByField() {
        return countryOrderByField;
    }

    public void setCountryOrderByField(CountryOrderByField countryOrderByField) {
        this.countryOrderByField = countryOrderByField;
    }

    public boolean needOrdering() {
        return super.needOrdering() && countryOrderByField != null;
    }
}
