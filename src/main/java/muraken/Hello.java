package muraken;

public class Hello {
  
  private String name;
  
  public Hello(String name){
    this.name = name;
  }
  
  public String say() {
    return "Hello! " + this.name;
  }
  
  public void surprise() {
    throw new IllegalArgumentException("Wow!");
  }
}
