class Encap
 {
  public String name;
  protected String gmail;
  private String password;
  public String getPassword()
  {
   setPassword(password);
   return this.password;
  }
  public void setPassword(String pass)
  {
   this.password = pass;
  }
 }

 public class Encapsulation
 {
  public static void main(String[] args)
  {
   Encap account = new Encap();
   account.name= "Abhi";
   account.gmail="abhi@gmail.com";
   account.setPassword("ravi");
System.out.println(account.getPassword());
  }

 }

