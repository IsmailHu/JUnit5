package org.my.triangle;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void getType() {
        Triangle t = new Triangle(3,3,3);
        assertEquals("Equilateral", t.getType());
    }

    @org.junit.jupiter.api.Test
    void getType2() {
        Triangle t = new Triangle(3,3,2);
        assertEquals("Isosceles", t.getType());
    }
    @org.junit.jupiter.api.Test
    void getType3() {
        Triangle t = new Triangle(3,4,5);
        assertEquals("Scalene", t.getType());
    }
    @org.junit.jupiter.api.Test
    void getType4() {
        Triangle t = new Triangle(3,4,0);
        assertEquals("Not a triangle", t.getType());
    }

}