import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private BinarySearch search;

    @BeforeEach
    void setup() {
        this.search = new BinarySearch();
    }

    @Test
    void testIsFoundOnEmptyArray() {
        int[] numbers = {};
        int num = 2;
        assertFalse(() -> search.isFound(numbers, num));
    }

    @Test
    void testIsFoundInFirstHalf() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        int num = 2;
        assertTrue(() -> search.isFound(numbers, num));
    }

    @Test
    void testIsFoundInSecondHalf() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        int num = 5;
        assertTrue(() -> search.isFound(numbers, num));
    }

    @Test
    void testIsFoundIfNumberNotPresent() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        int num = 9;
        assertFalse(() -> search.isFound(numbers, num));
    }

    @Test
    void testIsFoundIfNumberIsFirstInArray() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        int num = 0;
        assertTrue(() -> search.isFound(numbers, num));
    }

    @Test
    void testIsFoundIfNumberIsLastInArray() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        int num = 6;
        assertTrue(() -> search.isFound(numbers, num));
    }

    @Test
    void testIsFoundForEachNumberInArray() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        for (int num : numbers) {
            assertTrue(() -> search.isFound(numbers, num));
        }
    }

}