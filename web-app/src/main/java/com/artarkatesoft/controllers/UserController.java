package com.artarkatesoft.controllers;

import com.artarkatesoft.domain.UserCommand;
import com.artarkatesoft.entities.User;

public class UserController {
    User getUser(UserCommand userCommand){
        //fake implementation
        return  new User();
    }
}
