package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class MathUtilsTest {
    private MathUtils math;
    @BeforeEach
    void setUp(){
        math = new MathUtils();
    }
    @Test
    void test(){
        assertEquals(11, math.add(5,6));
    }
    @Test
    void test1(){
        assertEquals(1, math.divide(2, 2));
    }
    @Test
    void test3(){
        assertThrows(ArithmeticException.class, () -> {math.divide(2, 0);});
    }
    @Test
    void test4(){
        assertEquals(12, math.add(6, 6));
    }
}
