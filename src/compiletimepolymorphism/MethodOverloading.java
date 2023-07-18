package compiletimepolymorphism;

public class MethodOverloading 
{

	public static void main(String[] args)
	{
		MethodOverloading mo =new MethodOverloading();
		mo.login(976612341);  
	}
	public void login(String username,String password)
	{
		System.out.println("login with username and password");
	}
	public void login(int MobileNumber)
	{
		System.out.println("login with MobileNumber");
	}
	public void login(String GoogleAccount)
	{
		System.out.println("login with GoogleAccount");
	}

}
