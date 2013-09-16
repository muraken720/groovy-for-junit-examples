package muraken

import org.junit.Test

class MyServiceGTrest {
  @Test
  void "例外を気にしなくてよい例"() {
    //setup
    def target = new MyService()
    
    target.setDao(new MyDaoImpl(true))
    
    //exercise
    //groovyでは例外を気にする必要がないため、そのまま書ける。
    def actual = target.getUserName(0)
    
    //verify
    assert actual.equals("muraken720")
  }
}
