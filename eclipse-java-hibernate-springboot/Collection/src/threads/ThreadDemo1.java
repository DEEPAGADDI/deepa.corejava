package threads;
class myThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Child class "+i);
	}
	}
}
public class ThreadDemo1 {
public static void main(String[] args) {
	myThread1 ob=new myThread1();
	ob.start();
	for(int i=0;i<=10;i++) {
   	 System.out.println("Parent thread "+i);
    }
}
}
