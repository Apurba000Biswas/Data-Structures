package practise_set_4_OOP;

public class PatentLawyer extends Lawyer{
	
	public PatentLawyer(String myLawScool, int myYears){
		super(myLawScool, myYears);
	}
	
	public String filePatent(String invention){
		return invention + " will make you a millionaire!";
	}
}
