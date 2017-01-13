
public class Chief extends Employee {

	private double bonusBase = 1;
	public double bonusCalculation() {
	    
		double bonus = salary * bonusBase;
		return bonus;
	}	
	
	public Chief() {
		super();
		
	}


	public Chief(int empNumber, String firstName, String lastName, GenderType gender, String address,
			String departmentName, String birthdate, int salary) {
		super(empNumber, firstName, lastName, gender, address, departmentName, birthdate, salary);
	
}

}