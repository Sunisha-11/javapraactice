package oopsConsept;

public class GrandSon extends Child
{

	public static void main(String[] args) {
		GrandSon gs = new GrandSon();
		gs.login();
		gs.CreateContac();
		gs.Logout();
	}
public void Logout()
{
	System.out.println("logged out successfully");
}
}
