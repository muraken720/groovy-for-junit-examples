package muraken;

public class MyDaoImpl implements MyDao {

  private boolean enabled = false;

  public MyDaoImpl() {
  }

  public MyDaoImpl(boolean enabled) {
    super();
    this.enabled = enabled;
  }

  @Override
  public String getUserName(int userId) {
    return "muraken720";
  }

  @Override
  public Boolean isEnabled() {
    return this.enabled;
  }

}
