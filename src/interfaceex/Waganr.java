package interfaceex;

public class Waganr implements car

{

	public static void main(String[] args) 
	{
		Waganr w= new Waganr();
		w.model();
		w.price();
		w.color();

	}

	@Override
	public void model() {
		System.out.println("car model is waganr CNG");
		
	}

	@Override
	public void price() {
		System.out.println("price of Waganr CNG is 8lacks rs");
	}

	@Override
	public void color() {
		System.out.println("color of Waganr CNG is silver");
		
	}

}
