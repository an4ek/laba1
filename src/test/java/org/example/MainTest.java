package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //1
    @Test
    void fizzBuzz() {
        int n = 1;
        List<String> list = Main.fizzBuzz(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");

        assertEquals(expected, list);
    }

    //2
    @Test

    void reverse() {
        String line = "make install";
        String reversedLine = "llatsni ekam";
        assertEquals(reversedLine, Main.reverse(line));
    }

    //3
    @Test
    void discriminant() {
        List<String> list = Main.discriminant(1,-3,2);
        List<String> expected = List.of(
                "2.0",
                "1.0"
        );
        assertEquals(expected, list);
    }
    //4
    @Test
    void rowSum() {
        double res = Main.RowSum();
        double expected = 1.2208087941897636;

        assertEquals(expected, res);
    }
    //5
    @Test
    void polindrom() {
        boolean list1 = Main.palindrom("level");
        boolean list2 = Main.palindrom("nut");


        assertTrue(list1);
        assertFalse(list2);
    }



}