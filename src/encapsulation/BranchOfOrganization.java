package encapsulation;

public class BranchOfOrganization extends OrganizationName
{

	public static void main(String[] args) 
	{
		BranchOfOrganization bb=new BranchOfOrganization();
		bb.getclinic();
		System.out.println("*******************************************");
		bb.setclinic("neeraj", "neeraj@11");
		bb.getclinic();
	}

}
