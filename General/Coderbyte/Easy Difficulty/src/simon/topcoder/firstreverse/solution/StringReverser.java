package simon.topcoder.firstreverse.solution;

public class StringReverser {
  public String reverseString(String stringToReverse) {
//    if (stringToReverse.length() == 0 || stringToReverse.length() == 1)
//      return stringToReverse;
    
    String reverse = "";
    for (int index = stringToReverse.length() - 1; index >= 0; index--)
      reverse += Character.toString(stringToReverse.charAt(index));
    return reverse;
    
//    if (stringToReverse.length() == 2) {
//      reverse += Character.toString(stringToReverse.charAt(1)) + Character.toString(stringToReverse.charAt(0));
//      return reverse;
//    }
//    
//    reverse += Character.toString(stringToReverse.charAt(2)) + Character.toString(stringToReverse.charAt(1)) + Character.toString(stringToReverse.charAt(0));
//    return reverse;
  }
}
