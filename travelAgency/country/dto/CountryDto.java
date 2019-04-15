package travelAgency.country.dto;

import java.util.List;
import travelAgency.city.domain.City;
import travelAgency.city.dto.CityDto;
import travelAgency.common.buisness.dto.BaseDTO;

public class CountryDto extends BaseDTO<Long> {

    protected String name;
    protected Double square;

    private List<CityDto> cities;

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

    public List<CityDto> getCities() {
        return cities;
    }

    public void setCities(List<CityDto> cities) {
        this.cities = cities;
    }
}
