package org.my.triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestParameterised {

    @DisplayName("Test getType method")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, c={2}, expected={3}")
    @CsvSource({
            "3,3,3, Equilateral",
            "3,4,5, Scalene",
            "3,3,5, Isosceles",
            "0,3,3, Not a triangle",
            "2,2,4, Not a triangle",
            "4,2,2, Not a triangle",
            "2,4,2, Not a triangle"
    })
    void getType(int a, int b, int c, String expected) {
        assertEquals(expected,new Triangle(a,b,c).getType());
    }
}