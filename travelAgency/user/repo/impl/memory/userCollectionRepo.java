package travelAgency.user.repo.impl.memory;

import static travelAgency.storage.Storage.usersList;

import java.util.List;
import travelAgency.user.domain.User;
import travelAgency.user.repo.UserRepo;
import travelAgency.user.search.UserSearchCondition;

public class userCollectionRepo implements UserRepo {

    private final UserRepo userRepo;

    public userCollectionRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> search(UserSearchCondition searchCondition) {
        return null;
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
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            userRepo.deleteById(id);
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
