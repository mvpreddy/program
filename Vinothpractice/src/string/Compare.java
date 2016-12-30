package string;

public class Compare {

	public static void main(String[] args) {
		String s1="reddy";
		String s2="reddy";
		String s3=new String("reddy");
		String s4="REDDY";
		System.out.println(s3.compareTo(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1==s2);
		// TODO Auto-generated method stub
           
	}

}
