package multithreading;



class Table{
	synchronized static void printtable(int n){
		for(int i=1;i<5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(1000);}
				catch(Exception e){System.out.println(e);
			
			}
		}
	}
}

/*class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;}
		public void run(){
		t.printtable(11);
	}}
		class MyThread2 extends Thread{
			Table t;
			MyThread2(Table t){
				this.t=t;}
				public void run(){
				t.printtable(100);
			}
			
	
	
}*/

public  class Sync {

	public static void main(String[] args) {
		final Table obj=new Table();
	Thread t1=new Thread(){
		public void run()
	{
			obj.printtable(5);}
	};
	Thread t2=new Thread()
	{public void run()
	{obj.printtable(100);}
	};
		t1.start();
		t2.start();
	
		
		// TODO Auto-generated method stub

	}

}
