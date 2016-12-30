package exception;

public class Expropagation {
	 private void m()
	{
		int i=23/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try{
			n();
			}
		catch(Exception e){System.out.println("exception handled");}
		
	}
	public static void main(String[] args) {
		Expropagation rdy=new Expropagation();
		rdy.p();
	
	}
}
