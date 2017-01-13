
public class Developer extends Employee{
	
	private double bonusBase = 0.5;
	public double bonusCalculation() {
//	    double bonusBase = 0.5;
		double bonus = salary * bonusBase;
		return bonus;
	}	
	public Developer() {
		super();
		
	}
	
	public Developer(int empNumber, String firstName, String lastName, GenderType gender, String address,
			String departmentName, String birthdate, int salary) 
	{
		super(empNumber, firstName, lastName, gender, address, departmentName, birthdate, salary);
	
}
}
