package threads;
class myThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread " +i);
	}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     myThread t=new myThread();
     t.start();//this will create a thread
     //t.run();//This will not create thread
	}

}
