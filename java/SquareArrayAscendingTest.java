import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SquareArrayAscendingTest {

    @ParameterizedTest
    @MethodSource("getTestParameters")
    void testSortedSquares(int[] input, int[] expected) {
        int[] result = SquareArrayAscending.getArraySquareInAscendingOrder(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortedSquares() {
        int[] input = {-5, -4, -1, 0, 1, 5, 2};
        int[] result = SquareArrayAscending.getArraySquareInAscendingOrder(input);
        int[] expected = {0, 1, 1, 4, 16, 25, 25};
        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> getTestParameters() {
        return Stream.of(
                Arguments.of(
                        new int[]{3, 2, 7, 1, 4},
                        new int[]{1, 4, 9, 16, 49}
                ),
                Arguments.of(
                        new int[]{2, 1, 6, 3, 9},
                        new int[]{1, 4, 9, 36, 81}
                )
        );
    }
}