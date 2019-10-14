package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void testSimple1() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void testSimple2() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void testSimple3() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("abc", 0);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void testWithASpace() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("a test", 1);
        Assertions.assertEquals("b uftu", result);
    }
}
