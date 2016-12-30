package startpractice;

public class chair{
	 public int height;
	int weight;
	String colour;
	 public int multiplication(int height, int weight){
	int result = 0;
	 result =height * weight;
	 System.out.println(result);
	 return result;
	}
	public static void main(String[] args){
		chair c1 = new chair();
		c1.height =20;
		c1.weight =10;
		c1.colour ="ggg";
		c1.multiplication(c1.height,c1.weight);
		System.out.print(c1.multiplication(c1.height,c1.weight));
		System.out.println("rrrrr");
		
	}
		
	}