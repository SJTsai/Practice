package simon.topcoder.firstreverse.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import simon.topcoder.firstreverse.solution.StringReverser;

public class StringReverserTest {
  @Test
  public void testReverseString() {
    StringReverser stringReverser = new StringReverser();
    assertEquals("", stringReverser.reverseString(""));
    assertEquals("i", stringReverser.reverseString("i"));
    assertEquals("ii", stringReverser.reverseString("ii"));
    assertEquals("hi", stringReverser.reverseString("ih"));
    assertEquals("hit", stringReverser.reverseString("tih"));
    assertEquals("high", stringReverser.reverseString("hgih"));
    assertEquals(" ", stringReverser.reverseString(" "));
    assertEquals("  ", stringReverser.reverseString("  "));
    assertEquals("h ", stringReverser.reverseString(" h"));
    assertEquals("h f  f", stringReverser.reverseString("f  f h"));
    assertEquals("8th Light", stringReverser.reverseString("thgiL ht8"));
    assertEquals("abcdefghijklmnopqrstuvwxyz", stringReverser.reverseString("zyxwvutsrqponmlkjihgfedcba"));
  }
}
