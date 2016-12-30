package collections;
import java.io.FileReader;
import java.util.*;
import java.lang.*;

public class Test {
	/*public static void main(String[] args) {

	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	  
	Collections.sort((List<T>) al);
	for(Student st:al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);
	}}}*/
		// TODO Auto-generated method stub
		 public static void main(String[] args)throws Exception{  
			  
			Properties p=System.getProperties();  
			Set set=(Set) p.entrySet();  
			  
			Iterator itr=set.iterator();  
			while(itr.hasNext()){  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" = "+entry.getValue()); 
		    FileReader reader=new FileReader("db.properties");  
		      
		    Properties p1=new Properties();  
		    p1.load(reader);  
		      
		    System.out.println(p1.getProperty("user"));  
		    System.out.println(p1.getProperty("password"));  
		} }}
		 



