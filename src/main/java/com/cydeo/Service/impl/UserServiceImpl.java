package com.cydeo.Service.impl;

import com.cydeo.Service.UserService;
import com.cydeo.dto.UserDTO;

import java.util.List;

public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {


    @Override
    public UserDTO save(UserDTO user) {

        return super.save(user.getUsername(), user);
    }

    @Override
    public UserDTO findbyId(String username) {
        return super.findbyID(username);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deletebyId(String username) {
super.deleteById(username);
    }
}
