package oberserve;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector students = new Vector();
		Teacher t = new Teacher();
		Students s = new Students("�ο���", t);
		t.attachObserver(s);
		t.setPhone("123456");
		s.show();
		// for (int i = 0; i < 2; i++)
		// ((Students) students.get(i)).show();
		// t.setPhone("222222");
		// System.out.println("=======�ָ���=========");
		// for(int i=0;i<2;i++)
		// ((Students)students.get(i)).show();
		// t.setPhone("�����ע�⣬��ʦ�ĺ������");
		// System.out.println("=======�ָ���=========");
		// for(int i=0;i<2;i++)
		// ((Students)students.get(i)).show();
	}
}
