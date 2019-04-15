package travelAgency.user.service.impl;

import static travelAgency.storage.Storage.usersList;

import java.util.List;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;
import travelAgency.user.domain.User;
import travelAgency.user.repo.UserRepo;
import travelAgency.user.search.UserSearchCondition;
import travelAgency.user.service.UserService;

public class UserDefaultService implements UserService {

    private final UserRepo userRepo;

    public UserDefaultService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> search(UserSearchCondition searchCondition) {
        return userRepo.search(searchCondition);
    }

    @Override
    public void insert(User user) {
        if (user != null) {
            userRepo.insert(user);
        }
    }

    @Override
    public void update(User user) {
        if (user != null) {
            userRepo.update(user);
        }
    }

    @Override
    public User findById(Long id) {
        if (id != null) {
            return userRepo.findById(id);
        } else  {
            return null;
        }
    }

    @Override
    public void deleteById(Long id) throws TravelAgencyUncheckedException {
        if (id != null) {
            userRepo.deleteById(id);
        }
    }

    @Override
    public void delete(User user) {
        if (user != null) {
            userRepo.deleteById(user.getId());
        }
    }

    @Override
    public void printAll() {
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
