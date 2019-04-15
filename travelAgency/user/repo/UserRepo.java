package travelAgency.user.repo;

import java.util.List;
import travelAgency.common.solutions.repo.BaseRepo;
import travelAgency.user.domain.User;
import travelAgency.user.search.UserSearchCondition;

public interface UserRepo extends BaseRepo<User, Long> {

    List<User> search(UserSearchCondition searchCondition);

}
