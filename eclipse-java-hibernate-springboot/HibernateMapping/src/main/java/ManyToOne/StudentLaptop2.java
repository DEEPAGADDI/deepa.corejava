package ManyToOne;

import java.util.ArrayList;
import java.util.List;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class StudentLaptop2 {
@Id
private int sid;
private String sname;
private float fee;

@OneToOne
private List<Laptop2> lap2 = new ArrayList<Laptop2>();


public List<Laptop2> getLap2() {
	return lap2;
}
public void setLap2(List<Laptop2> lap2) {
	this.lap2 = lap2;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public float getFee() {
	return fee;
}
public void setFee(float fee) {
	this.fee = fee;
}


}
