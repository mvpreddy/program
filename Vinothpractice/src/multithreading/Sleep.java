package multithreading;
public class Sleep extends Thread{  
    public void run(){  
      System.out.println("running...");  
    }  
    public static void main(String args[]){  
     Sleep t1=new Sleep();  
     t1.start();  
     t1.start();  
    }  
    

/*public class Sleep extends Thread{
	public void run(){
		for(int i=1;i<6;i++){
		try{
			Thread.sleep(0);}catch(InterruptedException e){System.out.println(e);}
		System.out.println(i);}
	}

	public static void main(String[] args) {
		Sleep s2=new Sleep();
		Sleep s3=new Sleep();
		s2.start();
		s3.start();*/
		
		// TODO Auto-generated method stub

	

}
