package practise_set_4_OOP;

public class Lawyer extends Employee{
	
	private String lawScool;
	
	public Lawyer(String myLawScool ,int myYears) {
		super(myYears);
		
		lawScool = myLawScool;
	}

	public String sue(String defendant){
		return "See you in court, " + defendant + "!";
	}
	
	@Override
	public double salary(){
		return super.salary() * 2;
	}
	
	@Override
	public String vacationForm(){
		return "Pink";
	}
}
