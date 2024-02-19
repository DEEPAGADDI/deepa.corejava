package OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop1")
public class Laptop1 {
	@Id
	private int lid;
	private String lname;
	
	 @OneToMany
	   private List<StudentLaptop1> lap= new ArrayList<StudentLaptop1>();
	
	
	public List<StudentLaptop1> getLap() {
		return lap;
	}
	public void setLap(List<StudentLaptop1> lap) {
		this.lap = lap;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}