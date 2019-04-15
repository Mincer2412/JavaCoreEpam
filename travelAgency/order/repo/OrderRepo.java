package travelAgency.order.repo;

import java.util.*;
import travelAgency.common.solutions.repo.BaseRepo;
import travelAgency.order.domain.Order;
import travelAgency.order.search.OrderSearchCondition;

public interface OrderRepo extends BaseRepo<Order, Long> {

    List<Order> search(OrderSearchCondition searchCondition);

    int countByCity(long cityId);

    int countByCountry(long countryId);

    void deleteByUserId(long userId);

    List<Order> findByUserId(long userId);


}
