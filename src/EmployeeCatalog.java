
import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCatalog {
	static Scanner input = new Scanner(System.in);

	private static ArrayList<Employee> employeeCatalog = new ArrayList<Employee>(); 
	static Menu menu = new Menu();

	public static void addEmployee(Employee employee) {
		employeeCatalog.add(employee);
	}

	public void deleteEmployee() {
		System.out.println("Enter employee number : ");
		int empNumber = input.nextInt();
		Employee temp = null;
		for (Employee myEmployee : employeeCatalog) {
			if (myEmployee.getEmpNumber() == empNumber) {
				temp = myEmployee;
			}
		}
		employeeCatalog.remove(temp);
	}

	public void updateNameOfEmployee() {
		System.out.println("Enter employee number : ");
		int empNumber = input.nextInt();
		input.nextLine();
		for (Employee nextEmployee : employeeCatalog) {
			if (nextEmployee.getEmpNumber() == empNumber) {
				System.out.println(nextEmployee.toString());
				System.out.println("Enter new employee first name : ");
				String firstName1 = input.nextLine();
				nextEmployee.setFirstName(firstName1);
			}
		}
	}

	public void updateDepartmentOfEmployee() {
		System.out.println("Enter employee number : ");
		int empNumber = input.nextInt();
		input.nextLine();
		for (Employee nextEmployee : employeeCatalog) {
			if (nextEmployee.getEmpNumber() == empNumber) {
				System.out.println(nextEmployee.toString());
				System.out.println("Choose the employee department : 1 - Developer  2 - Technician  3 - Chief");
				int department = input.nextInt();
				switch (department) {
				case 1:
					nextEmployee.setDepartmentName("Developer");
					break;
				case 2:
					nextEmployee.setDepartmentName("Technician");
					break;
				case 3:
					nextEmployee.setDepartmentName("Chief");
					break;
				}
			}
		}
	}

	public void updateSalaryOfEmployee() {
		System.out.println("Enter employee number: ");
		int empNumber = input.nextInt();
		input.nextLine();
		for (Employee nextEmployee : employeeCatalog) {
			if (nextEmployee.getEmpNumber() == empNumber) {
				System.out.println(nextEmployee.toString());
				System.out.println("Enter new salary: ");
				int salary = input.nextInt();
				nextEmployee.setSalary(salary);
			}
		}
	}

	public void searchEmployeeName() {
		System.out.println("Enter first name: ");
		String name = input.nextLine();

		boolean found = false;

		for (Employee nextEmployee : employeeCatalog) {
			if (nextEmployee.getFirstName().equalsIgnoreCase(name))
				found = true;

			if (found == true)
				System.out.println(nextEmployee.toString());
			else {
				System.out.println("********  There is no employee with that name  ********");
			}

		}

			
	}

	public void searchEmployeeNumber() {
		System.out.println("Enter employee number : ");
		int empNumber = input.nextInt();
		//boolean found = false;

		for (Employee myEmployeeNumber : employeeCatalog) {
			if (myEmployeeNumber.getEmpNumber() == (empNumber))
		//		found = true;

			//if (found == true)
				System.out.println(myEmployeeNumber.toString());
		//	else {
			//	System.out.println("********  There is no employee with that number  ********");
			}
				
		}
		
//	}

	public void searchEmployeeDepartment() {
		System.out.println("Choose the employee department : 1 - Developer  2 - Technician  3 - Chief");
		int department = input.nextInt();
		
		for (Employee nextEmployee : employeeCatalog) {
		
			switch (department) {
			case 1:
				if (nextEmployee.getDepartmentName().equalsIgnoreCase("Developer"))
					System.out.println(nextEmployee.toString());
			
			break;

			case 2:
				if (nextEmployee.getDepartmentName().equalsIgnoreCase("Technician"))
			
					System.out.println(nextEmployee.toString());
			
				break;

			case 3:
				if (nextEmployee.getDepartmentName().equalsIgnoreCase("Chief"))
					
					System.out.println(nextEmployee.toString());
				
				break;
			}
		}
		//System.out.println("********  There is no employee in that department  ********");
	}

	public void printEmployeeCatalog() {

		if (employeeCatalog.isEmpty()) {
			System.out.println("\n  *****  There is no staff  ***** \n");
		//	menu.mainMenu();
		} else {
			for (int i = 0; i < employeeCatalog.size(); i++) {
				System.out.println(employeeCatalog.get(i));
			}
		}
	}

	public void findMinimumSalary() {

		int minimumSalary = employeeCatalog.get(0).getSalary();

		for (Employee nextEmployee : employeeCatalog) {
			if (nextEmployee.getSalary() < minimumSalary){
				minimumSalary = nextEmployee.getSalary();
			}

		}

		System.out.println("The minimum salary is: "+  minimumSalary); 
	}

	public void findMaximumSalary() {

		int maximumSalary = 0;

		for (Employee nextEmployee: employeeCatalog) {
			if (nextEmployee.getSalary() > maximumSalary){
				maximumSalary = nextEmployee.getSalary();
			}
		}

		System.out.println("The maximum salary is: "+  maximumSalary);
	}

	public double calculatePercentageOfMen() {

		int numberOfMen = 0;
		int numberOfEmployees = employeeCatalog.size();

		for (Employee nextEmployee : employeeCatalog) {

			if (nextEmployee.getGender() == GenderType.MALE) {

				numberOfMen++;
			}
		}

		return (numberOfMen / numberOfEmployees) * 100;
	}

	public void calculatePercentageOfWomen() {

		int numberOfWomen = 0;
		int numberOfEmployees = employeeCatalog.size();

		for (Employee nextEmployee : employeeCatalog) {

			if (nextEmployee.getGender() == GenderType.FEMALE) {

				numberOfWomen++;
			}
		}

		System.out.println("Women percentage in the company " +(numberOfWomen*100 / numberOfEmployees)+"%"); 
	}
	
	public void bonusCalculation() {
		double totalBonus = 0 ;
		for (Employee nextEmployee : employeeCatalog) {
			totalBonus = totalBonus + nextEmployee.bonusCalculation();
		}
		System.out.println("The total bonus is: "+  totalBonus);		

		}
	public void averageWage() {
		double totalSalary = 0 ;
		for (Employee nextEmployee : employeeCatalog) {
			totalSalary = totalSalary + nextEmployee.salary;
		}
		System.out.println("Average wage at the company: "+  totalSalary / employeeCatalog.size());		

		}
}
