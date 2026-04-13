package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomLetterChooserTest {
   @Test
   public void randomLetterChooserTest(){
      RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
      String test = "";
      for(int i = 0; i < 4; i++)
        test+=letterChooser.getNext();
      assertEquals(7,test.length());
      assertEquals("NONE",test.substring(3));
      assertEquals(true,test.contains("c"));
      assertEquals(true,test.contains("a"));
      assertEquals(true,test.contains("t"));
   }
}
