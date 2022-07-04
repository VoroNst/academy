package by.academy.dial.validators;

import by.academy.dial.IValidator;

import java.util.List;
import java.util.regex.Pattern;

public abstract class BaseValidator implements IValidator {
    protected List<String> _patterns;
    public BaseValidator(List<String> patterns){
        _patterns = patterns;
    }

    @Override
    public boolean validate(String source) {
        return _patterns.stream().anyMatch(pattern->{
            Pattern reg = Pattern.compile(pattern);
            return reg.matcher(source).find();
        });
    }
}
