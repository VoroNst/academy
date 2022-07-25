package by.academy.homework.dial.validators;

import java.util.ArrayList;
import java.util.Arrays;

public class DateValidator extends BaseValidator {

    public DateValidator(){
        super(new ArrayList<>(Arrays.asList("^\\d{2}[/-]{1}\\d{2}[/,-]{1}\\d{4}$")));
    }

}
