package oberserve;

import java.util.Vector;

public class Teacher implements ISubject{


	private Vector students;
	private String name;
	private String phone;
	public Teacher()
	{
		phone="";
		students=new Vector();
	}
	public void attachObserver(IOberserver oberserver) {
		students.add(oberserver);
		
	}

	public void delObserver(IOberserver oberserver) {
		students.remove(oberserver);
	}
	public void notice() {
		for(int i=0;i<students.size();i++)
			((IOberserver)students.get(i)).update();
	}
	public Vector getStudents() {
		return students;
	}
	public void setStudents(Vector students) {
		this.students = students;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
		notice();
	}

	
}
