package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTest {
    private Rectangular r = null;

    @BeforeEach
    public void before(){
        this.r = new Rectangular(2.0,4.0);
    }

    @Test
    void computeArea() {
        assertEquals(r.computeArea(),8.0,0.01);
    }

    @Test
    void computeCircumference() {
        assertEquals(r.computeCircumference(),12.0,0.01);
    }
}