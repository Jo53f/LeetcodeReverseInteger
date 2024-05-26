import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    void reverse() {
        int testNum = 123;
        int reversed = main.reverse(testNum);
        assertEquals(321,reversed);
    }

    @Test
    void reverse2() {
        int testNum = -123;
        int reversed = main.reverse(testNum);
        assertEquals(-321,reversed);
    }

    @Test
    void reverse3() {
        int testNum = 120;
        int reversed = main.reverse(testNum);
        assertEquals(21,reversed);
    }

    @Test
    void reverse4() {
        int testNum = -2147483647;
        int reversed = main.reverse(testNum);
        assertEquals(0,reversed);
    }

    @Test
    void reverse5() {
        int testNum = 1534236469;
        int reversed = main.reverse(testNum);
        assertEquals(0,reversed);
    }

    @Test
    void reverse6() {
        int testNum = 1534236468;
        int reversed = main.reverse(testNum);
        assertEquals(0,reversed);
    }

    @Test
    void reverse7() {
        int testNum = 0;
        int reversed = main.reverse(testNum);
        assertEquals(0,reversed);
    }

    @Test
    void reverse8() {
        int testNum = -2147483412;
        int reversed = main.reverse(testNum);
        assertEquals(-2143847412,reversed);
    }
}