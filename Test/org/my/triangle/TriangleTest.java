package org.my.triangle;
import org.junit.jupiter.api.Assertions;

class TriangleTest {
    Triangle t;
    int sideA =3, sideB=3, sideC=3;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        t = new Triangle(sideA, sideB, sideC);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void testTriangle() {
        Assertions.assertEquals("Equilateral",t.getType());
    }
}