package travelAgency.country.serach;

import travelAgency.country.domain.Country;

public enum CountryOrderByField {
    NAME("markname"), SQUARE("squareamount");

    CountryOrderByField(String requestParamName) {
        this.requestParamName = requestParamName;
    }

    private String requestParamName;

    public String getRequestParamName() {
        return requestParamName;
    }
}
