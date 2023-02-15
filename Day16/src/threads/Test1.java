//creating threads using runnable interface

package threads;

class worker1 implements Runnable{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Thread One is working");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



class worker2 implements Runnable{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Hello from thread 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test1 {
	Thread t1,t2;
	Test1(){
		t1=new Thread(new worker1());
		t2=new Thread(new worker2());
		
		t1.setPriority(1);
		t2.setPriority(10); // priority range is 1 to 10. 1 is minimum
		
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new Test1();
	}
	
}
