package ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop2")
public class Laptop2 {
@Id
private int lid;
private String lname;

@ManyToOne
private List<StudentLaptop2> lap=new ArrayList<StudentLaptop2>();


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

public List<StudentLaptop2> getLap() {
	return lap;
}

public void setLap(List<StudentLaptop2> lap) {
	this.lap = lap;
}


}
