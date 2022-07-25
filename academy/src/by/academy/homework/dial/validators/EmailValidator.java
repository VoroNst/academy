package by.academy.homework.dial.validators;

import java.util.ArrayList;
import java.util.Arrays;

public class EmailValidator extends BaseValidator{
    public EmailValidator() {
        super(new ArrayList<>(Arrays.asList("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")));
    }
}
