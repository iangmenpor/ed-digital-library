package com.iesam.library.features.user.data.local;

import com.iesam.library.features.user.domain.User;

import java.util.*;

public class UserMemLocalDataSource implements DataSourceRepository{

    
    /*Patrón singleton*/
    private static UserMemLocalDataSource instance = null;
    
    public static UserMemLocalDataSource getInstance(){
        if (instance==null){
            instance = new UserMemLocalDataSource();
        }
        return instance;
    }
    private UserMemLocalDataSource(){
        
    }
    private Map<String, User> dataStore = new TreeMap<>();


    @Override
    public void save(User user) {
        dataStore.put(String.valueOf(user.id), user);
    }
    @Override
    public void saveList(List<User> models) {
        for (User demo : models) {
            save(demo);
        }
    }
    @Override
    public User findById(Integer id) {
        return dataStore.get(id);
    }
    @Override
    public List<User> findAll() {
        return dataStore.values().stream().toList();
    }
    @Override
    public void delete(Integer modelId) {
        dataStore.remove(modelId);
    }
}
