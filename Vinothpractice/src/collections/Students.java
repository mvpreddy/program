package collections;

import java.util.ArrayList;
/*import java.util.ArrayList;
import java.util.Iterator;*/
import java.util.*;

public class Students {

	public static void main(String[] args)
	{
	   Student s1=new Student(111,"vinod",22);
       Student s2=new Student(222,"ramr",15);
       ArrayList<Student> al=new ArrayList<Student>();
       al.add(s1);
       al.add(s2);

Iterator itr=al.iterator();
while(itr.hasNext())
{
	Student st=(Student)itr.next();
	System.out.println(st.rollno+" "+st.name+" "+st.age);
}

		// TODO Auto-generated method stub

	}

}
