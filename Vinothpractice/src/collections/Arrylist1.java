package collections;

import java.util.*;

public class Arrylist1 {

	public static void main(String[] args) {
		/*ArrayList<String> al=new ArrayList<String>();
		al.add("vinod");
		al.add("kumar");
		for(String obj:al)
			System.out.println(obj);
		
		*/
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("bhumi");
		al.add("vinod");
		al.add("kumar");
		al.add("reddy");
		al.add("mukesh");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("bhumi");
		al2.add("mukesh");
		
		al.retainAll(al2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){System.out.println(itr.next());
		

	}

}}
