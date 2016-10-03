package packeges.service;

import packeges.entity.User;

import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
public interface UserService {
    void add(User user);
    void update(User user);
    User findById(int id);
    User findByUserName(String username);
    List<User> findAll();
}
