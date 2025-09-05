package net.imt.atlantique.fil.demo.mapper;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import net.imt.atlantique.fil.demo.domain.User;
import net.imt.atlantique.fil.demo.web.dto.user.CreateOrUpdateUserDto;
import net.imt.atlantique.fil.demo.web.dto.user.UserDto;

@Component
public class UserMapper {
    public User toUser(ObjectId userId, CreateOrUpdateUserDto userDto) {
        return new User(userId, userDto.name, userDto.email);
    }

    public User toUser(String userId, CreateOrUpdateUserDto userDto) {
        return toUser(new ObjectId(userId), userDto);
    }

    public User toUser(CreateOrUpdateUserDto userDto) {
        return toUser(new ObjectId(), userDto);
    }

    public UserDto toUserDto(User user) {
        return new UserDto(user.id.toHexString(), user.name, user.email);
    }
}
