package exception;

public class Throw {
	 
	 static void validate (int age)
		{
		if (age<18)
	
		throw new ArithmeticException("not valid");
		else
			System.out.println("vote now");
	}public static void main(String[] args) {
		validate(22);
		System.out.println("tfjghg");}

}
