package oberserve;

public class Students implements IOberserver {//相当于观察者对应的实现类

	private Teacher t;//必须有一个被观察者的实例
	private String name;
	private String phone;

	public Students(String name, Teacher tc) {
		this.t = tc;
		this.name = name;
	}

	public void update() {
		phone = t.getPhone();
	}

	public void show() {
		System.out.println("NMAE" + name + "\nTeacher's phone" + phone);
	}

}
