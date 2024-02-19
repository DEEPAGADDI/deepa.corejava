package threads;

class Display1{
	public synchronized void menu(String item) throws InterruptedException {
		for(int i=0;i<=10;i++) {
			Thread.sleep(1000);
			System.out.println("Place the order "+item);
		}
			
	}
	
}
class MythreadS extends Thread{
	Display1 d;
	String item;
	public MythreadS(Display1 d, String item) {
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
public class SynchronizedThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Display1 d=new Display1();
       MythreadS t1=new MythreadS(d,"Masala dosa");
       t1.start();
       t1.join();//
       MythreadS t2=new MythreadS(d,"Idle vada");
       t2.start();
       MythreadS t3=new MythreadS(d,"Gobi");
       t3.start();
       System.out.println("main Thread");//First Preference will be for this but to overcome this we use join 
	}

}
