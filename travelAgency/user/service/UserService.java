package travelAgency.user.service;

import java.util.List;
import travelAgency.common.solutions.service.BaseService;
import travelAgency.user.domain.User;
import travelAgency.user.search.UserSearchCondition;

public interface UserService extends BaseService<User, Long> {

    List<User> search(UserSearchCondition searchCondition);

}
