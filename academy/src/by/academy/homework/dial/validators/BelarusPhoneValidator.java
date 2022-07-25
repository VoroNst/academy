package by.academy.homework.dial.validators;

import java.util.ArrayList;
import java.util.Arrays;

public class BelarusPhoneValidator extends BaseValidator {
    public BelarusPhoneValidator() {
        super(new ArrayList<>(Arrays.asList("^[+]375\\d{9}$")));
    }
}
