package runtimepolymorphism;

public class ChildOverridingMethod extends ParentOverridingMethod
{

	public static void main(String[] args) {
		
		ChildOverridingMethod cc=new ChildOverridingMethod();
		cc.add();
	}
public void add()
{int a=33;
int b=66;
int c=a+b;
System.out.println(c);
	}

}
