package javapractice;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int x=30;
		int y=40;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	

}
