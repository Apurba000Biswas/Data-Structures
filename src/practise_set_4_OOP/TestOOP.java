package practise_set_4_OOP;

public class TestOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOOP obj = new TestOOP();
		obj.run();
	}
	
	private void run(){
		
		Employee emp = new Employee(2);
		printInfo(emp);
		emp = new Lawyer("Stanford", 4);
		printInfo(emp);
		System.out.println("Sue : " + ((Lawyer)emp).sue("Marty"));
		
	}
	
	private void printInfo(Employee emp){
		System.out.println("\nEmployee Information : ");
		System.out.println("Hours: " + emp.hours() + "\nSalary : "
				+ emp.salary() + "\nVacation Days : " + emp.vacationDays() + "\nVacation Form : " + emp.vacationForm());
	}

}
