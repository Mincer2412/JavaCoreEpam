package travelAgency.order.service;

import java.util.List;
import travelAgency.common.solutions.service.BaseService;
import travelAgency.order.domain.Order;
import travelAgency.order.search.OrderSearchCondition;

public interface OrderService extends BaseService<Order, Long> {

    List<Order> search(OrderSearchCondition searchCondition);

    void deleteByUserId(Long userId);

    List<Order> getOrdersByUser(Long userId);

}
