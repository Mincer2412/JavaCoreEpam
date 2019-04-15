package travelAgency.order.dto;

import travelAgency.city.domain.City;
import travelAgency.common.buisness.dto.BaseDTO;
import travelAgency.country.domain.Country;
import travelAgency.user.domain.User;

public class OrderDto extends BaseDTO<Long> {

    private User user;
    private City city;
    private Country country;
    private String description;
    private int price;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
