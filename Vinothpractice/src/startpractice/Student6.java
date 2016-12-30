package startpractice;

public class Student6 {

	  int id;  
	    String name;  
	    Student6(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Student6(Student6 s1){  
	    id = s1.id;  
	    name =s1.name;}  
	   
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Student6 s1 = new Student6(111,"Karan");
	    Student6 s2 = new Student6(222,"raju");
	    Student6 s3 = new Student6(s1);  
	    Student6 s4 = new Student6(s2);
	    s1.display();  
	    s2.display();
	    s3.display();
	    s4.display();
	    }
}