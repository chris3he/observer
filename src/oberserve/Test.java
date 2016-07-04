package oberserve;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector students = new Vector();
		Teacher t = new Teacher();
		Students s = new Students("何快洛", t);
		t.attachObserver(s);
		t.setPhone("123456");
		s.show();
		// for (int i = 0; i < 2; i++)
		// ((Students) students.get(i)).show();
		// t.setPhone("222222");
		// System.out.println("=======分隔线=========");
		// for(int i=0;i<2;i++)
		// ((Students)students.get(i)).show();
		// t.setPhone("大家请注意，老师的号码变了");
		// System.out.println("=======分隔线=========");
		// for(int i=0;i<2;i++)
		// ((Students)students.get(i)).show();
	}
}
