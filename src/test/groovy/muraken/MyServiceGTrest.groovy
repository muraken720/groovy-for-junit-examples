package muraken

import org.junit.Test

class MyServiceGTrest {
  @Test
  void "例外を気にしなくてよい例"() {
    //setup
    def target = new MyService()
    
    target.setDao(new MyDaoImpl(true))
    
    //exercise
    def actual = target.getUserName(1)
    
    //verify
    assert actual.equals("muraken720")
  }
}
