package multithreading;

public class Rtc {
	public static void main(String[] args) {
		 Runtime r=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		    
		  for(int i=0;i<10000;i++){ new Rtc(); }  
		  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
		 }  
		
	/*Runtime r=Runtime.getRuntime();
	System.out.println("freememory is:"+r.freeMemory());
	System.out.println("totalmemory is:"+r.totalMemory());
	
	for(int i=1;i<1000;i++){new Rtc();}
	System.out.println("freememory is:"+r.freeMemory());
	System.gc();
	System.out.println("totalmemory is:"+r.totalMemory());
	


	
*/

}
