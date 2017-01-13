
public class Technician extends Employee {
	private double bonusBase = 0.3;
	public double bonusCalculation() {
	    
		double bonus = salary * bonusBase;
		return bonus;
		
		}
	public Technician() {
		super();
		
	}
	
	public Technician(int empNumber, String firstName, String lastName, GenderType gender, String address,
			String departmentName, String birthdate, int salary) 
	{
		super(empNumber, firstName, lastName, gender, address, departmentName, birthdate, salary);
	
}
}