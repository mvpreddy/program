package startpractice;

interface  ride {
	 void run();
}
class Royal implements ride {
	
public void run(){System.out.println("it is thunderbird 350");}

public static void main(String args[]) {
	Royal obj =new Royal();
	obj.run();
}
}/*interface     printable{  
	void print();  
	}  
	  
	class A6 implements printable{  
	public void print(){System.out.println("Hello");}  
	  
	public static void main(String args[]){  
	A6 obj = new A6();  
	obj.print();  
	 } */ 
	/*} 
*/

