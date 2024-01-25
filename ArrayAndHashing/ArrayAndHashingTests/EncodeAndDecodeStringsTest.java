package ArrayAndHashing.ArrayAndHashingTests;

import org.junit.jupiter.api.Test;
import ArrayAndHashing.ArrayAndHashingProblems.EncodeAndDecodeStrings;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeStringsTest {
    @Test
    public void testEncodeAndDecodeStrings() {
        EncodeAndDecodeStrings codec = new EncodeAndDecodeStrings();
        List<String> strs = Arrays.asList("Hello", "World");
        String encoded = codec.encode(strs);
        List<String> decoded = codec.decode(encoded);
        assertEquals(strs, decoded);
    }
}

