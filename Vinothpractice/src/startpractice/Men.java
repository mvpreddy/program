package startpractice;

public class Men  extends HumanBeing {
	
	public void talk(){
		System.out.println("men talking");
	}
	void display(int a,String n){
		age=a;
		name=n;
		System.out.println(age+""+name);
		
	}
	
	public static void main(String[] args) {
	
		Men m =new Men();
		
		m.talk();
	/*System.out.println(m.age);
	System.out.println(m.name);*/
	m.display(24,"nn");
	
	}

}
