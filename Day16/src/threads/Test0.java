package threads;

class worker extends Thread{
	
	public void run() {
		// run is a predefined method.
//		when a thread is started it automatically looks for run methods.
		// The job of thread is defined inside run method
		
//		System.out.println("Hi I am thread");
		for(int i=1;i<=10;i++) {
			System.out.println("Thread 1 running ... "+ new java.util.Date());
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Test0 {
	public static void main(String[] args) {
		worker w1 = new worker();
		w1.start(); // start method is used to start thread,which indirectly calls run() method
		
	}
}
