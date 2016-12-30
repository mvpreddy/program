package collections;
import java.util.*;

public class Linked {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("vinod");
		al.add("arun");
		/*LinkedList<String> al1=new LinkedList<String>();*/
		al.add("sunil");
		al.add("raju");
		al.add(2, "sachin");
		System.out.println("element at second position is"+al.get(3));
		ListIterator<String>itr=al.listIterator();
		
		System.out.println("traversing elementsin forword condition is");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("traversing elementsin backwordcondition is");
		while(itr.hasPrevious())
		{System.out.println(itr.previous());
		}
		/*System.out.println("AL is :"+al);
		System.out.println("LL is : "+al1);
  */
	}

}
