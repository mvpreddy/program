package multithreading;

public  class Tg implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Tg Runnable=new Tg();
		ThreadGroup tg1=new ThreadGroup("vinod");
		Thread t1=new Thread(tg1,Runnable,"one");
		t1.start();
		Thread t2=new Thread(tg1,Runnable,"two");
		t2.start();
		Thread t3=new Thread(tg1,Runnable,"three");
		t3.start();
		Thread t4=new Thread(tg1,Runnable,"four");
		t4.start();
		tg1.list();
        System.out.println("Thread Group Name: "+tg1.getName());
		tg1.activeGroupCount();
	}

}
