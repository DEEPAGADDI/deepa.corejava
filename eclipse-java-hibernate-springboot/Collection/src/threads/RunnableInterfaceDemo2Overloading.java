package threads;
class Mythread5 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("No arg");
	}
}
public class RunnableInterfaceDemo2Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Mythread5 ob=new Mythread5();
   Thread t=new Thread(ob);
   t.start();
   t.run();
   
	}

}
