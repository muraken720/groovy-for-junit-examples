package muraken;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HelloTest {
  @Test
  public void sayのテスト() {
    //setup
    Hello target = new Hello("muraken720");
    
    //exercise
    String actual = target.say();
    
    //verify
    assertThat(actual, is("Hello! muraken720"));
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void surpriseのテスト() {
    //setup
    Hello target = new Hello("");
    
    //exercise
    target.surprise();
    
    //verify
    fail();
  }
}
