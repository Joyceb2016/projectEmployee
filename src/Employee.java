
import java.util.Scanner;

public class Employee {
	private String departmentName;
	private int empNumber;  
	private String firstName;
	private String lastName;
	private GenderType gender;
	private String address;
	private String birthdate;
	protected int salary;	
	static Scanner input = new Scanner(System.in);	

	public Employee() {		
		System.out.println("Enter employee number : ");
		empNumber = input.nextInt();
		input.nextLine();
		System.out.println("Enter First Name : ");
		firstName = input.nextLine();
		System.out.println("Enter Last Name : ");
		lastName = input.nextLine();
		System.out.println("Enter Address : ");
		address = input.nextLine();
		System.out.println("Enter birthdate : ");
		birthdate = input.nextLine();
		System.out.println("Enter gender : ");
		String genderString = input.nextLine(); 
			if (genderString.equalsIgnoreCase("female"))
			{
			  gender = GenderType.FEMALE;
			}
			else if (genderString.equalsIgnoreCase("male"))
			{
			  gender = GenderType.MALE;
			}
			else
			{
			  gender = GenderType.UNKNOWN;
			}	
		System.out.println("Enter salary : ");
		salary = input.nextInt();

	}

	@Override
	public String toString() {
		return empNumber + " :  " + firstName + " " +  lastName  + "\t     " +  departmentName  + "\t   " +  address + "\t   " +  salary;
	}

	public double bonusCalculation() {
		return salary;
		}
	
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName(){
	  return firstName + " " + lastName;
	}
	
	public GenderType getGender() {
		return gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}







