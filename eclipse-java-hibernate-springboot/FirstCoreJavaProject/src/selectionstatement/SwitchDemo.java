package selectionstatement;
//case expression must be constant
public class SwitchDemo {

	public static void main(String[] args) {
		
		int x=10;
		switch(x) {
		case 10:
			System.out.println("hello");
			break;//if we dont give break then both hello,hi,ramya,shree will print as output
		case 20:
			System.out.println("hi");
			default:
				System.out.println("ramya");
			case 28:
				System.out.println("shree");
		    }
				
				//using final keyword
				int a=10;
				final int b=20;
				switch(a) {
				case 10:
					System.out.println("helooo");
					break;
				case b:
					System.out.println("hii");
		         }
				
				int z=10;
				switch(z+1) {
				case 10+1:
					System.out.println("ramya");
				case 20+30+40:
					System.out.println("110");
				case 20+40:
				System.out.println("60");
				}
				
				byte r=20;
				switch(r) {
				case 20:
					System.out.println("Red");
				case 30:
					System.out.println("Blue");
				case 127:  //we should not use more than 127 because we used data type as byte (byte can has only -127 to 128)
					System.out.println("White");
				}
				
				byte s=20;
				switch(s+1){
				case 10:
					System.out.println("banana");
				case 20+1:
					System.out.println("mango");
				case 1000:
					System.out.println("apple");// we are adding 1 to the byte so we wont get error
				
				}
	}
	}