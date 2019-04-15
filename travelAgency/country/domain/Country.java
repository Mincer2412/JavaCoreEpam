package travelAgency.country.domain;


import java.util.List;
import travelAgency.city.domain.City;
import travelAgency.common.buisness.domain.BaseDomain;

public abstract class Country extends BaseDomain<Long> {

    protected String name;
    protected Double square;

    private List<City> cities;

    public Country() {

    }

    public Country(String name, Double square) {
        this.name = name;
        this.square = square;
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

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
            "name='" + name + '\'' +
            ", square=" + square +
            ", cities=" + getCitiesAsList() +
            '}';
    }

    public String getCitiesAsList() {
        StringBuilder sb = new StringBuilder();
        for (City c : cities) {
            sb.append(c.toString()).append("\n");
        }

        return sb.toString();
    }

    public String toStringWithoutCities() {
        return "Country{" +
            "name='" + name + '\'' +
            ", square=" + square + '}';
    }
}
