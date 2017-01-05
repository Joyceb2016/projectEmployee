
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	public  int choose, chooseMenu, chooseManagement,chooseSatistics;
	public static String accept; 
	static Main Main = new Main();
	static EmployeeCatalog employeeCatalog = new EmployeeCatalog();
	
	public static void main(String[] args) {
		Main.mainMenu ();
		
	}

	public void mainMenu (){
		System.out.println("\n*********************************************************");
		System.out.println("\n**     Welcom to the Personnel Management System       **\n");
		System.out.println("*********************************************************");
		System.out.println("\n Select from the menu");
		System.out.println("------------------------\n");
		System.out.println("1 - Employee management ");				
		System.out.println("2 - Employee statistics ");	
		System.out.println("3 - Exit");

		chooseMenu = input.nextInt();
		switch (chooseMenu){
		case 1: employeeManagment();break;		
		case 2: employeeStatistics();break;
		case 3: System.out.println(" ********  Thanks for using the system!  ******** ");
		input.close();				
		}		
	}

	public  void employeeManagment(){
		System.out.println("\n Select from the menu");
		System.out.println("1 - Register employee ");
		System.out.println("2 - Delete employee ");
		System.out.println("3 - Update first name of employee");
		System.out.println("4 - Update the department of employee");
		System.out.println("5 - Update Salary of employee ");
		System.out.println("6 - Search employee by name ");
		System.out.println("7 - Search employee number ");
		System.out.println("8 - Display employee by department ");                                                                                                               
		System.out.println("9 - Display all employees ");
		System.out.println("10 - Back to main menu ");
		chooseManagement = input.nextInt();
	
		switch (chooseManagement){
		case 1: registerEmployee(); break;
		case 2: employeeCatalog.deleteEmployee(); mainMenu (); break;
		case 3: employeeCatalog.updateNameOfEmployee(); mainMenu (); break;
		case 4: employeeCatalog.updateDepartmentOfEmployee(); mainMenu (); break;
		case 5: employeeCatalog.updateSalaryOfEmployee(); mainMenu (); break;
		case 6: employeeCatalog.searchEmployeeName(); mainMenu (); break;
		case 7: employeeCatalog.searchEmployeeNumber(); mainMenu (); break;
		case 8: employeeCatalog.searchEmployeeDepartment(); mainMenu (); break;
		case 9: employeeCatalog.printEmployeeCatalog(); mainMenu (); break;
		case 10: mainMenu (); break;

		}
	}

	public void employeeStatistics(){
		System.out.println("\n Select from the menu");
		System.out.println("1 - Average wage at the company");
		System.out.println("2 - Maximum salary in the company ");
		System.out.println("3 - Minimum salary in the company");
		System.out.println("4 - Total bonus");
		System.out.println("5 - Women in percentage in the company");
		System.out.println("6 - Men percentage of the various work role categories");
		System.out.println("7 - Back to main menu ");
		chooseSatistics = input.nextInt();
	
		switch(chooseSatistics){
		case 1:
		case 2: employeeCatalog.averageWage(); mainMenu (); break;		
		case 3: employeeCatalog.findMinimumSalary(); mainMenu (); break;		
		case 4: employeeCatalog.bonusCalculation(); mainMenu (); break;	
		case 5: employeeCatalog.calculatePercentageOfWomen(); mainMenu (); break;		
		case 6:
		case 7: mainMenu(); break;
		}
	}
	public void registerEmployee(){
		do{
			System.out.println("Choose the employee department : 1 - Developer  2 - Technician  3 - Chief");
			choose = input.nextInt();
			switch (choose){
			case 1: 
				
				Developer developer = new Developer();
				developer.setDepartmentName("Developer");
				EmployeeCatalog.addEmployee(developer);
				break;
			case 2:
				
				Technician technician = new Technician();
				 technician.setDepartmentName("Technician");
				EmployeeCatalog.addEmployee(technician);
				break;
			case 3:
				
				Chief chief = new Chief();
				chief.setDepartmentName("Chief");
				EmployeeCatalog.addEmployee(chief);
				break;
			default: 
				System.out.println("Not a valid choice, enter a number between 1 and 3.");
			}

			System.out.println("Would you like to add another employee? Y / N ");
			accept = input.next();
		}while (accept.equalsIgnoreCase("y"));

		if (accept.equalsIgnoreCase("n")){
			mainMenu ();
		}
	}
}
