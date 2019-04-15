package travelAgency.user.dto;

import java.sql.ResultSet;
import java.util.Optional;
import travelAgency.common.buisness.dto.BaseDTO;
import travelAgency.order.domain.Order;
import travelAgency.user.domain.ClientType;

public class UserDto extends BaseDTO<Long> {
    private String name;
    private String lastName;
    private int age;
    private ClientType clientType;
    private Boolean sex; // false -female; true - male
    private Order[] orders;

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
}
