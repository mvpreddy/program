package startpractice;

public class Calc {
	void rdy(int a,int b){System.out.println(a+b);}
	void add(double a,int b,int c){System.out.println(a+b+c);}

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.rdy(12, 12);
		obj.add(12.5, 12,12);

	}

}
