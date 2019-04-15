package travelAgency.storage;

import java.util.ArrayList;
import travelAgency.city.domain.City;
import travelAgency.country.domain.Country;
import travelAgency.order.domain.Order;
import travelAgency.user.domain.User;

public class Storage {

    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Country> countriesList = new ArrayList<>();
    public static ArrayList<City> citiesList = new ArrayList<>();
    public static ArrayList<Order> ordersList = new ArrayList<>();


}
