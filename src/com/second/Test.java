package com.second;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {

		Vector p=new Vector();
		Manager m = new Manager();
		String[] players={"pg","sg","sf","pf","c"};
		for(int i=0;i<5;i++)
		{
			Stuff s=new Stuff(players[i],m);
			m.addObserver(s);
			m.setMisson("���������ذ�");
			m.setLocation("˹̨��˹����");
			p.add(s);
		}
		for(int i=0;i<p.size();i++)
		{
			((Stuff)p.get(i)).show();
		}

	}

}
