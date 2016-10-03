package packeges.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import packeges.entity.User;
import packeges.repo.UserRepository;

import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username","name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password","password.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","email.empty");
    }
}
