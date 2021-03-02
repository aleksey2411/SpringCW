package by.bsuir.project.validator;

import by.bsuir.project.model.User;
import by.bsuir.project.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    private UserService userService;

    @Autowired
    public UserValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        ValidationUtils.rejectIfEmpty(errors,"email","Required");
        if(user.getEmail().length()<8||user.getEmail().length()>32) {
            errors.rejectValue("email","Size.userForm.email");
        }

        if(!userService.isEmailFree(user.getEmail())) {
            errors.rejectValue("email","Duplicate.userForm.email");
        }
    }
}
