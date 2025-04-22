package com.example.calculator;

@FunctionalInterface
public interface LargerNumberFinder<T, U> {
    T findLargerNumber(U u);
}
