package threads;

class Display5{
	public synchronized void menu(String item) throws InterruptedException {
		for(int i=0;i<=4;i++) {
//			Thread.sleep(1000);
			
			System.out.println("Place the order "+item);
			Thread.yield();//First Preference for main method
		}
			
	}
	
}
class Mythreads15 extends Thread{
	Display5 d;
	String item;
	public Mythreads15(Display5 d, String item) {
		super();
		this.d = d;
		this.item = item;
	}
	public void run() {
		try {
			d.menu(item);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class ThreadJoinMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Display5 d=new Display5();
       Mythreads15 t1=new Mythreads15(d,"Masala dosa");
       t1.start();
//       t1.join();//
       Mythreads15 t2=new Mythreads15(d,"Idle vada");
       t2.start();
       Mythreads15 t3=new Mythreads15(d,"Gobi");
       t3.start();
       System.out.println("main Thread");//First Preference will be for this but to overcome this we use join 
	}

}
