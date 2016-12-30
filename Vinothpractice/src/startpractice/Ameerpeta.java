package startpractice;

abstract class Ameerpeta {
	abstract void institutions();
}
 class Durga extends Ameerpeta{ 
	void institutions()
	{ System.out.println("java coaching");}}
class Sai extends Ameerpeta {
	void institutions (){System.out.println("oracle coaching");
	}
}	
	class Test {
public static void main(String[] args)
{
	Ameerpeta rdy=new Sai();
		Ameerpeta  obj = new Durga();
		obj.institutions();
		/*Ameerpeta rdy=new Sai();*/
		rdy.institutions();
		
		
}}



/*abstract class Bike{  
    abstract void run();  
  }  
  class Honda4 extends Bike{  
  void run(){System.out.println("running safely..");}  
  public static void main(String args[]){  
   Bike obj = new Honda4();  
   obj.run();  
  }  
  }  */