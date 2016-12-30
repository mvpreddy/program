package exception;

public class Extest {

	public static void main(String[] args) {
		try{
			/*int i=50/0;*/
			int a[]=new int[5];
			a[20]=20/0;
		}catch(Exception e){System.out.println(e);}
		/*catch (ArithmeticException e) {
			System.out.println("task1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task2");
		}
		 catch(Exception e){System.out.println(e);} */
	
	System.out.println("rest of code");
	System.out.println("final stmt");
	}

}
