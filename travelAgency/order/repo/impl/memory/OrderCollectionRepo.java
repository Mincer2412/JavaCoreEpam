package travelAgency.order.repo.impl.memory;

import static travelAgency.storage.Storage.ordersList;

import java.util.ArrayList;
import java.util.List;
import travelAgency.order.domain.Order;
import travelAgency.order.repo.OrderRepo;
import travelAgency.order.search.OrderSearchCondition;
import travelAgency.storage.SequenceGenerator;

public class OrderCollectionRepo implements OrderRepo {

    @Override
    public List<Order> search(OrderSearchCondition searchCondition) {
        return null;
    }

    @Override
    public int countByCity(long cityId) {
        int counter = 0;

        for (Order order : ordersList) {
            if (cityId == order.getCity().getId()) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public int countByCountry(long countryId) {
        int counter = 0;

        for (Order order : ordersList) {
            if (countryId == order.getCountry().getId()) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public void deleteByUserId(long userId) {
        for (Order order : ordersList) {
            if (userId == order.getUser().getId()) {
                ordersList.remove(order);
            }
        }
    }

    @Override
    public List<Order> findByUserId(long userId) {
        List<Order> foundOrders = new ArrayList<>();

        for (Order order : ordersList) {
            if (order.getUser().getId().equals(userId)) {
                foundOrders.add(order);
            }
        }

        return foundOrders;
    }

    @Override
    public void insert(Order order) {
        order.setId(SequenceGenerator.getNextValue());
        ordersList.add(order);
    }

    @Override
    public void update(Order entity) {
        //
    }

    @Override
    public Order findById(Long id) {
        return findOrderById(id);
    }

    @Override
    public void deleteById(Long id) {
        Order order = findOrderById(id);

        if (order != null) {
            ordersList.remove(order);
        }
    }

    @Override
    public void printAll() {
        for (Order order : ordersList) {
            System.out.println(order);
        }
    }

    @Override
    public List<Order> findAll() {
        return ordersList;
    }

    private Order findOrderById(long orderId) {
        for (Order order : ordersList) {
            if (Long.valueOf(orderId).equals(order.getId())) {
                return order;
            }
        }
        return null;
    }
}