package com.artarkatesoft.controllers;

import com.artarkatesoft.converters.UserMapper;
import com.artarkatesoft.domain.UserCommand;
import com.artarkatesoft.entities.User;

public class UserController {
    User getUser(UserCommand userCommand){
        //MapStruct mapper implementation
        return UserMapper.INSTANCE.toUser(userCommand);
    }
}
