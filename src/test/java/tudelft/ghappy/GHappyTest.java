package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void testGAfter() {
        GHappy var1 = new GHappy();
        boolean result = var1.gHappy("xxggxx");
        Assertions.assertTrue(result);

    }

    @Test
    public void testNoBeforeAndNoAfter() {
        GHappy var1 = new GHappy();
        boolean result = var1.gHappy("xxgxx");
        Assertions.assertFalse(result);

    }

    @Test
    public void testGBefore() {
        GHappy var1 = new GHappy();
        boolean result = var1.gHappy("xxggyygxx");
        Assertions.assertFalse(result);

    }
}
