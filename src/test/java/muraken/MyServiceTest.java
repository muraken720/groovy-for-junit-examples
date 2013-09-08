package muraken;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MyServiceTest {
  @Test
  public void 例外を気にする必要がある例() throws MyException {
    //setup
    MyService target = new MyService();
    target.setDao(new MyDaoImpl(true));
    
    //exercise
    String actual = target.getUserName(1);
    
    //verify
    assertThat(actual, is("muraken720"));
  }
}
