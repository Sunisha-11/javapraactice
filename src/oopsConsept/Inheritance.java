package oopsConsept;

public class Inheritance {
	String logo="speedway";
	public static void main(String[] args)
	{
	
		Inheritance ic= new Inheritance();
		ic.login();
		ic.creatcontact();
		ic.logout();
	}
public void login()
    {
	    System.out.println("login successful");
	}
public void creatcontact()
{
	System.out.println("contact is created");
}
public void logout()
{
	System.out.println("logged out successful");
}
}
