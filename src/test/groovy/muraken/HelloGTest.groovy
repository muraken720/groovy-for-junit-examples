package muraken

import org.junit.Test

class HelloGTest {
  @Test
  void "1.1 sayのテスト"() {
    //setup
    def target = new Hello("muraken720")

    //exercise
    def actual = target.say()

    //verify
    assert "Hello! muraken720".equals(actual)
  }

  @Test(expected = IllegalArgumentException)
  void "1.2 surpriseのテスト"() {
    //setup
    def target = new Hello()

    //exercise
    target.surprise()

    //verify
    fail()
  }

  @Test
  void "1.3 例外メッセージを確認するテスト"() {
    //setup
    def target = new Hello()

    //exercise
    try {
      target.surprise()
    }
    catch(IllegalArgumentException e) {
      //verify
      assert e.message.equals("Wow!")
    }
  }
}
