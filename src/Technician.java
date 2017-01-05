
public class Technician extends Employee {

	public double bonusCalculation() {
	    double bonusBase = 0.3;
		double bonus = salary * bonusBase;
		return bonus;
	}
	
}
