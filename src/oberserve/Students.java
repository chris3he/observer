package oberserve;

public class Students implements IOberserver {//�൱�ڹ۲��߶�Ӧ��ʵ����

	private Teacher t;//������һ�����۲��ߵ�ʵ��
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
