package collections;
import java.util.*;
public class Set {

	public static void main(String[] args) {
		PriorityQueue<String>al=new PriorityQueue<String>();
		al.add("bhumi");
		al.add("vinod");
		al.add("kumar");
		al.add("reddy");
		al.add("mukesh");
		System.out.println("head:"+al.element());
		System.out.println("head:"+al.peek());
		System.out.println("iteration of queue elements");
		Iterator itr=al.iterator();
		while(itr.hasNext()){System.out.println(itr.next());
		}
		al.poll();
		al.remove();
        System.out.println("after removing the two elements");
        Iterator itr2=al.iterator();
		while(itr2.hasNext()){System.out.println(itr2.next());

}
}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}}