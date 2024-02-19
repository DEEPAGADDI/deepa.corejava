package OneToMany;

//we no need to create constructor usi
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;

@Entity
public class StudentLaptop1 {
   @Id
   private int sid;
   private String sname;
   private float fees;
  
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
public float getFees() {
	return fees;
}
public void setFees(float fees) {
	this.fees = fees;
}


}