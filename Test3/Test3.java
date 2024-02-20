import org.junit.jupiter.api.Test;
import org.trzcinska.Word;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class Test3 {
    private Word testObject = new Word();

    @Test
    public void test_countWords() {
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("Ala", 2);
        expected.put("ma", 2);
        expected.put("kota", 2);
        String tested = "Ala ma kota, kota ma Ala";

        HashMap<String,Integer> actual = testObject.countWords(tested);

        assertEquals(expected, actual);
    }

    @Test
    public void test_nullString() {
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put(null, 2);
        expected.put("ma", 2);
        expected.put("kota", 2);
        String tested = "Ala ma kota, kota ma Ala";

        HashMap<String,Integer> actual = testObject.countWords(tested);

        assertNotEquals(expected,actual);
    }

    @Test
    public void test_countOneWord() {
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("kota", 1);
        String tested = "kota";

        HashMap<String,Integer> actual = testObject.countWords(tested);

        assertEquals(expected,actual);
    }

    @Test
    public void test_emptyString() {
        String tested = "";

        HashMap<String,Integer> actual = testObject.countWords(tested);

        assertTrue(actual.isEmpty());
    }

    @Test
    public void test_whiteMarks() {
        String tested = "    ";

        HashMap<String,Integer> actual = testObject.countWords(tested);

        assertTrue(actual.isEmpty());
    }
}
