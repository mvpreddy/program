package startpractice;

public class student {
	int rollno;
	String name;
	public void insertrecord(int r, String n){rollno = r;
	name = n;
	}
	void displayinformation(){System.out.println(rollno+" "+name);
	}
	

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student ();
		
		s1.insertrecord(111, "vinod");
		s2.insertrecord(222, "reddy");
		
		s1.displayinformation();
		s2.displayinformation();
		
		// TODO Auto-generated method stub

	}

}
