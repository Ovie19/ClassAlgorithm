import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {

    @ParameterizedTest
    @CsvSource({
            "I am a Barcelona fan, I",
            "Bueno soy una chico tan bueno, soy"
    })
    void getShortestWordFromASentenceTest(String sentence, String expected) {
        assertEquals(expected, ShortestWord.getShortestWordCount(sentence));
    }

    @Test
    void testSortedSquares() {
        String text = "... Hippopotamus ...";
        String expected = "Hippopotamus";
        assertEquals(expected, ShortestWord.getShortestWordCount(text));
    }
}