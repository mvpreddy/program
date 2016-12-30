package startpractice;

public class Student14 {
	 int id;  
	    String name;  
	    String city;  
	    Student14(){System.out.println("this is ");}
	      
	    Student14(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    Student14(int id,String name,String city){ 
	    this();
	    this.city=city; 
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	    Student14 e1 = new Student14(111,"karan");  
	    Student14 e2 = new Student14(222,"Aryan","this");  
	    e1.display();  
	    e2.display(); 
		// TODO Auto-generated method stub

	}

}
