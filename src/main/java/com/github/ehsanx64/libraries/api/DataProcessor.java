package com.github.ehsanx64.libraries.api;

public interface DataProcessor {
    String process(String input);
    boolean validate(String input);
    String transform(String input);
} 