package com.iesam.library.features.user.data.local;

import com.iesam.library.features.user.domain.User;

import java.util.List;

public interface DataSourceRepository {
    void save(User user);
    void saveList(List<User> models);
    User findById(Integer id);
    List<User> findAll();
    void delete(Integer id);
}
