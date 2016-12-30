package startpractice;

public class Constructer {
	int rollno;
	String clgnm;
	Constructer(int r, String c){
		rollno=r;
		clgnm=c;
	}
	
	void display(){System.out.println(rollno+" " +clgnm);}

	public static void main(String[] args) {
		Constructer s1 = new Constructer(111,"vbit");
		s1.display();
		// TODO Auto-generated method stub

	}

}
