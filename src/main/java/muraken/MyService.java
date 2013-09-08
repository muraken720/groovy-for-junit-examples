package muraken;

public class MyService {
  
  private MyDao dao;

  public String getUserName(int userId) throws MyException {

    if(!this.dao.isEnabled()) {
        throw new MyException("MyService is not enabled.");
    }

    return this.dao.getUserName(userId);

  }

  public void setDao(MyDao dao) {
    this.dao = dao;
  }

}
