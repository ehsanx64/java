package com.github.ehsanx64.libraries.api;

import com.github.ehsanx64.libraries.utils.StringUtils;

public class SimpleDataProcessor implements DataProcessor {
    @Override
    public String process(String input) {
        return StringUtils.capitalize(input);
    }
    
    @Override
    public boolean validate(String input) {
        return input != null && !input.trim().isEmpty();
    }
    
    @Override
    public String transform(String input) {
        if (!validate(input)) {
            return "Invalid input";
        }
        return StringUtils.reverse(process(input));
    }
} 