package muraken

import spock.lang.Specification

class MyServiceSpec extends Specification {
  
  def "実クラスを使う"() {
    setup:
    def target = new MyService()
    target.setDao(new MyDaoImpl(true))
    
    when:
    def actual = target.getUserName(0)
    
    then:
    actual.equals("muraken720")
  }
  
  def "実クラスを使ったテストで例外を検証する"() {
    setup:
    def target = new MyService()
    target.setDao(new MyDaoImpl())
    
    when:
    def actual = target.getUserName(0)
    
    then:
    def e = thrown(MyException)
    e.message.equals("MyService is not enabled.")
  }
  
  def "Stubを使う"() {
    setup:
    def target = new MyService()
    MyDao dao = Stub() {
      getUserName(_) >> "muraken720"
      isEnabled() >> true
    }
    target.setDao(dao)
    
    when:
    def actual = target.getUserName(0)
    
    then:
    actual.equals("muraken720")
  }
  
  def "Mockの使う"() {
    setup:
    def target = new MyService()
    MyDao dao = Mock() {
      1 * getUserName(_) >> "muraken720"
      1 * isEnabled() >> true
    }
    target.setDao(dao)
    
    when:
    def actual = target.getUserName(0)
    
    then:
    actual.equals("muraken720")
  }
  
  def "Spyを使う"() {
    setup:
    def target = new MyService()
    // isEnabledは実クラスのメソッドを呼び出すため、定義不要
    MyDao dao = Spy(MyDaoImpl, constructorArgs: [true]) {
      getUserName(_) >> "muraken720"
    }
    target.setDao(dao)
    
    when:
    def actual = target.getUserName(0)
    
    then:
    actual.equals("muraken720")
  }
}
