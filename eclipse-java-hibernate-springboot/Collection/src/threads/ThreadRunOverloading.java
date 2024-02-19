package threads;
class myThread2 extends Thread{
	public void run() {
		System.out.println("No arg");
	}
	public void run(int a) {
		System.out.println("1 arg");
	}
	public void run(int a,int b) {
		System.out.println("2 arg");
	}
	public void run(String str) {
		System.out.println("String arg");
	}
}
public class ThreadRunOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread2 t=new myThread2();
        t.start();
        t.run();//Calling explicitly
        t.run(10);//Calling Explicitly
	    t.run(10,20);//Calling Explicitly
	    t.run("Deepa");
	}

}
