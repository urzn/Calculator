package com.example.calculator;

@FunctionalInterface
public interface LargerNumberFinder<T, U> {
    T findLargerNumber(T t, U u);
}
