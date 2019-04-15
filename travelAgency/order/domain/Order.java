package travelAgency.order.domain;

import travelAgency.city.domain.City;
import travelAgency.common.buisness.domain.BaseDomain;
import travelAgency.country.domain.Country;
import travelAgency.user.domain.User;

public class Order extends BaseDomain<Long> {

    private User user;
    private City city;
    private Country country;
    private String description;
    private int price;

    public Order() {
    }

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
