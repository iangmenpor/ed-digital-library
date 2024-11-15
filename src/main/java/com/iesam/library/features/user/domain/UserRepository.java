package com.iesam.library.features.user.domain;

import java.util.List;

public interface UserRepository {

    void saveUser(User user);
    void saveUserList(List<User> models);
    User getUser(Integer id);
    List<User> getUsers();
    void deleteUser(Integer id);
}
