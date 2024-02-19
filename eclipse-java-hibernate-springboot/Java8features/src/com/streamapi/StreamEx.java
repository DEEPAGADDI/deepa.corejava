package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class emp{
	int eid;
	String ename;
	public int geteid() {
		return eid;
	}
	public void seteid(int emp) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + "]";
	}
	
}
public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<emp> a = new ArrayList<>();
		a.add(new emp(101, "Bhoomi"));
		a.add(new emp(104, "Joker"));
		a.add(new emp(106, "Anand"));
		a.add(new emp(109, "Ananya"));
		a.add(new emp(110,"Manvitha"));
		System.out.println(a);
		//to count 
		long count=a.stream().count();
		
	   System.out.println("Number of employees "+count);
	   
	   long start_witha = a.stream().filter(b -> b.getEname().startsWith("A")).count();
		System.out.println( "Count No of employee Start with letter 'A': "+start_witha);
	  //our code
		List<emp> start_with_A=a.stream().filter(x->x.getEname().startsWith("A")).toList();
	   System.out.println("Employee Names Starting with letter 'A' "+start_with_A);
	   //for this below code max we will get highest employee id with out using class name
	   Object max=a.stream().collect(Collectors.maxBy(Comparator.comparingDouble(b->b.eid)));
	   System.out.println("Highest employee id is "+max);
	   //
	   Object avg = a.stream().collect(Collectors.averagingDouble(b -> b.eid));
		System.out.println("Average between 101 to 110 "+avg);
		//using class name
		Optional<emp> aso = a.stream().collect(Collectors.maxBy(Comparator.comparingDouble(b -> b.eid)));
		System.out.println("Max id "+aso);
		// using class name
		Stream<emp> s = a.stream().filter(name -> name.getEname().startsWith("B"));
		System.out.println("name starts with 'B' "+s.collect(Collectors.toList()));
	   
	}

}
