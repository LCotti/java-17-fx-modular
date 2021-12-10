package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle c = null;

    @BeforeEach
    public void before(){
        this.c = new Circle(3.0,1.0,1.2);
    }
    @Test
    void computeArea() {
        assertEquals(c.computeArea(),9.0*Math.PI,0.01);
    }

    @Test
    void computeCircumference() {
        assertEquals(c.computeCircumference(),6*Math.PI,0.01);
    }
}