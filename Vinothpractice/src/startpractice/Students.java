package startpractice;

class Students {
	int rollno;
	String name;
	String collegename = "ITS";
		
			  
	Students(int r, String n){
		rollno =r;
		name =n;
	}
	void display (){System.out.println(rollno+" "+name+" "+collegename);}

	public static void main(String[] args) {
		Students s1 = new Students(11,"vinod");
		Students s2 = new Students(22,"reddy");
		
	
	
s1.display();
s2.display();
	} 
}
