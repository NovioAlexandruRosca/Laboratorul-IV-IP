import java.util.Vector;

public class Admin extends User {

    public Vector<Hospital> myHospital;

  public Boolean rutineCheck() {
    return true;
  }

  public Boolean maintanance() {
    return true;
  }

  private String checkDatabase() {
    return "";
  }

}