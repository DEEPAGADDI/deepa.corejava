package collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class RealTimeExHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, Integer> stock=new HashMap<String, Integer>();
      stock.put("Laptop", 30);
      stock.put("Smart Mobile", 10);
      stock.put("Ipad", 30);
      stock.put("Iphone15 max Pro", 30);
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Product ");
      
      
      String pro=sc.nextLine();
      System.out.println("Enter the Quantity");
      Integer qty=sc.nextInt();
      
      if(stock.containsKey(pro)) {
    	  if(qty<=stock.get(pro)) {
    	  int remain=stock.get(pro)-qty;
    	  System.out.println("Purchased Successfully Remaining Stocks are "+remain);
      }
      
      else if(qty>stock.get(pro))
      {
    	  System.out.println("out of Stock");
      }
	}
	}
}
