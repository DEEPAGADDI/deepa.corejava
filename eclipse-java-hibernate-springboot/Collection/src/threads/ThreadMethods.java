package threads;
class myThread7 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child thread");
	}
	
}
public class ThreadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     myThread7 t=new myThread7();
//     Thread t=new Thread(ob);
//     t.start();
     
     System.out.println("The Thread Name is "+t.getName());
     t.setName("bob");
     System.out.println("After Updating Thread Name "+t.getName());
     
    System.out.println("Thread Priority "+t.getPriority());
     t.setPriority(1);//if we set more then 10 then it throw exception
     System.out.println("After setting Priority "+t.getPriority());
     
     System.out.println("Get Id "+t.getId());
     t.start();
     
	}

}
