package abstraction;

public class Hospital extends medigram
{

	public static void main(String[] args) {
		Hospital h =new Hospital();
		h.consultation();
		h.addmissionBill();
		h.medicalBill();
		h.dischargeSummary();
		h.healthInsurance();
	}

	@Override
	public void dischargeSummary() 
	{
		System.out.println("patient is discharged on monday ");
		
	}

	@Override
	public void healthInsurance() {
		System.out.println("HealthInsurance is covered");
	}

}
