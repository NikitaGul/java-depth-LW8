package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void checkFindMinimumMaximum1() {
        double[][] matrix = {
                {2.3, 3.6, 4.7},
                {4.5, 7.4, 3.7},
                {4.6, 3.6, 4.5}
        };

        int index = 1;
        Main.findMinimumMaximum(matrix, index);

        assertEquals(3.6, Main.min);
        assertEquals(7.4, Main.max);
    }

    @Test
    void checkFindMinimumMaximum2() {
        double[][] matrix = {
                {2.5, 5.7, 4.8},
                {3.6, 7.4, 8.9},
                {3.4, 6.4, 8.5}
        };
        int index = 0;
        Main.findMinimumMaximum(matrix, index);

        assertEquals(2.5, Main.min);
        assertEquals(3.6, Main.max);
    }

    @Test
    void checkFindMinimumMaximum3() {
        double[][] matrix = {
                {3.4, 3.6, 3.5},
                {2.4, 3.6, 2.1},
                {6.4, 3.6, 4.6}
        };
        int index = 1;
        Main.findMinimumMaximum(matrix, index);

        assertEquals(3.6, Main.min);
        assertEquals(3.6, Main.max);
    }
}