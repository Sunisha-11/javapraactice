package oopsConsept;

public class CreateCompany extends Inheritance
{

	public static void main(String[] args)
	{
		CreateCompany cc= new CreateCompany();
		System.out.println(cc.logo);
		cc.login();
		cc.creatcontact();
		cc.CreateCompany();
		cc.logout();
	}
	public void CreateCompany()
	{
		
		System.out.println("company is created");
		
	}

}
