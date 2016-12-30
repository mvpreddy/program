package exception;
import java.io.*;
 class Throws 
 {
void m() throws IOException
{
	throw new IOException("divice error");
}
void n() throws IOException
{
	m();
}
void p()
{
	try{
		n();
		} 
	catch(Exception e){System.out.println("handled");}

	}

	public static void main(String[] args) {
		Throws obj=new Throws();
		obj.p();
		System.out.println("normal flow obtained");
		
		
	

	}

}
