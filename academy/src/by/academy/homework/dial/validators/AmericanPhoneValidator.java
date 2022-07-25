package by.academy.homework.dial.validators;

import java.util.ArrayList;
import java.util.Arrays;


public class AmericanPhoneValidator  extends BaseValidator {
    public AmericanPhoneValidator () {
        super(new ArrayList<>(Arrays.asList("^[+]1\\d{10}$")));
    }
}