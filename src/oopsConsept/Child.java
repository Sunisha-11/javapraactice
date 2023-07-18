package oopsConsept;

public class Child extends Parent
{

	public static void main(String[] args) {
		Child c=new Child();
		c.login();
		c.CreateContac();
	}
public void CreateContac()
{
	System.out.println("Contact is Created");
}
}
