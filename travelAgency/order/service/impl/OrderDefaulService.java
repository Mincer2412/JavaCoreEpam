package travelAgency.order.service.impl;

import static travelAgency.storage.Storage.ordersList;

import java.util.List;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;
import travelAgency.order.domain.Order;
import travelAgency.order.repo.OrderRepo;
import travelAgency.order.search.OrderSearchCondition;
import travelAgency.order.service.OrderService;

public class OrderDefaulService implements OrderService {

    private final OrderRepo orderRepo;

    public OrderDefaulService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public List<Order> search(OrderSearchCondition searchCondition) {
        return orderRepo.search(searchCondition);
    }

    @Override
    public void deleteByUserId(Long userId) {
        if (userId != null) {
            orderRepo.deleteByUserId(userId);
        }
    }

    @Override
    public List<Order> getOrdersByUser(Long userId) {
        if (userId != null) {
            return orderRepo.findByUserId(userId);
        } else {
            return null;
        }
    }

    @Override
    public void insert(Order order) {
        if (order != null) {
            orderRepo.insert(order);
        }
    }

    @Override
    public void update(Order order) {
        if (order != null) {
            orderRepo.update(order);
        }
    }

    @Override
    public Order findById(Long id) {
        if (id != null) {
            return orderRepo.findById(id);
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(Long id) throws TravelAgencyUncheckedException {
        if (id != null) {
            orderRepo.deleteById(id);
        }
    }

    @Override
    public void delete(Order order) {
        if (order.getId() != null) {
            this.deleteById(order.getId());
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
        return orderRepo.findAll();
    }


}
