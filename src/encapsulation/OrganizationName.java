package encapsulation;

public class OrganizationName {
	private String username="shri sai";
	private String password="aurved@111";
	
	public static void main(String[] args) {
		
		
		
	}
	public void getclinic()
	{
		System.out.println(username);
		System.out.println(password);
	}
	public void setclinic(String usname,String pwd)
	{
		username= usname;
		password=pwd;
	}

}
