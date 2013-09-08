package muraken

import spock.lang.Specification

class HelloSpec extends Specification {

  def "1.1 sayをテストする"() {
    setup:
    def target = new Hello("muraken720")

    when:
    def actual = target.say()

    then:
    "Hello! muraken720".equals(actual)
  }

  def "1.2 例外送出をテストする"() {
    setup:
    def target = new Hello("muraken720")

    when:
    target.surprise()

    then:
    def e = thrown(IllegalArgumentException)
    e.message.equals("Wow!")
  }
}
