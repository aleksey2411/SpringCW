package by.bsuir.project.service.mapper;

import by.bsuir.project.dto.UserDto;
import by.bsuir.project.model.User;
import by.bsuir.project.service.interfaces.MapperService;
import org.springframework.stereotype.Service;

@Service
public class UserMapper implements MapperService<User, UserDto> {
    @Override
    public UserDto toDto(User user) {
        return null;
    }

    @Override
    public User toEntity(UserDto userDto) {
        return null;
    }
}
