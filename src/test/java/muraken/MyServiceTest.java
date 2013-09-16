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
    //ここで、try-catchを書くか、メソッドにthrowsを書くかが必要になる。
    //この例ではthrowsにしている。
    String actual = target.getUserName(0);
    
    //verify
    assertThat(actual, is("muraken720"));
  }
}
