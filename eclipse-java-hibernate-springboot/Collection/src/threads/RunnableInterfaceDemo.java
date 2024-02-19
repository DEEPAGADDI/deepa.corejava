package threads;
class myThread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
		System.out.println("Child Thread");
		}
	}
	
}
public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread3 ob=new myThread3();
		Thread t=new Thread(ob);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Parent Thread");
		}
	}

}
