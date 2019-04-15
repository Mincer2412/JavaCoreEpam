package travelAgency.user.domain;

import java.util.Arrays;
import travelAgency.common.buisness.domain.BaseDomain;
import travelAgency.order.domain.Order;

public class User extends BaseDomain<Long> {

    private String name;
    private String lastName;
    private int age;
    private ClientType clientType;
    private Boolean sex; // false -female; true - male
    private Order[] orders;

    public User() {
    }

    public User(String name, String lastName, ClientType clientType) {
        this.name = name;
        this.lastName = lastName;
        this.clientType = clientType;
    }

    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }


    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", clientType=" + clientType +
            ", sex=" + sex +
            ", orders=" + Arrays.toString(orders) +
            '}';
    }
}
