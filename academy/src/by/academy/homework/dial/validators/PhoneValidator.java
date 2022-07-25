package by.academy.homework.dial.validators;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneValidator extends BaseValidator{
    public PhoneValidator() {
        super(new ArrayList<>(Arrays.asList("^[+]1\\d{10}$","^[+]375\\d{9}$")));
    }
}
