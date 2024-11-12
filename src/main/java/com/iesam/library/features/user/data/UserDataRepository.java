package com.iesam.library.features.user.data;

import com.iesam.library.features.user.data.local.DataSourceRepository;
import com.iesam.library.features.user.data.local.UserFileDataSource;
import com.iesam.library.features.user.domain.User;
import com.iesam.library.features.user.domain.UserRepository;

import java.util.List;

public class UserDataRepository implements UserRepository {

    DataSourceRepository dataSourceRepository = new UserFileDataSource();


    @Override
    public void saveUser(User user) {
        dataSourceRepository.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return dataSourceRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {dataSourceRepository.delete(id);}
}
