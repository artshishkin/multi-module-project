package com.artarkatesoft.converters;

import com.artarkatesoft.domain.UserCommand;
import com.artarkatesoft.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User toUser(UserCommand userCommand);

    UserCommand toUserCommand(User user);

}
