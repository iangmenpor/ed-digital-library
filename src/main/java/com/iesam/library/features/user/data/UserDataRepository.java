package com.iesam.library.features.user.data;

import com.iesam.library.features.user.data.local.DataSourceRepository;
import com.iesam.library.features.user.data.local.UserFileDataSource;
import com.iesam.library.features.user.domain.User;
import com.iesam.library.features.user.domain.UserRepository;

import java.util.ArrayList;
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
        return dataSourceRepository.findAll();
    }

    @Override
    public void deleteUser(Integer id) {dataSourceRepository.delete(id);}

    @Override
    public void updateUser(User user) {
        List<User> userList = new ArrayList<>(dataSourceRepository.findAll());
        for (int i=0; i < userList.size(); i++){
            User user1 = userList.get(i);
            if (user.id.equals(user1.id)){
                userList.set(i,user);
                dataSourceRepository.saveList(userList);
                return;
            }
        }
    }
}
