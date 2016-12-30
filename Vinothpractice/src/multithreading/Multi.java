package multithreading;

public class Multi extends Thread /*implements Runnable*/{
	public void run(){
		try{
		System.out.println("tgrhred is running...");}catch(Exception e){System.out.println(e);}
	}
	public static void main(String[] args) {
		Multi t1 =new Multi();
		t1.start();
		t1.start();

	}

}
 