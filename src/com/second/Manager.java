package com.second;

import java.util.Vector;

public class Manager implements Subject {

	private Vector stuffs;// stuffs managed by this manager
	private String misson;// misson of this week
	private String location;//����ص�
    public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
		notice();
	}
	public Manager()
    {
    	stuffs=new Vector();
    }
	public void notice() {// notice()���־���ÿ�ζ�����һ�飬û�Ķ��Ļ�updateҲ��ִ�У�ֻ�ǽ��������ѣ��иĶ��͸ı���Ӧ��֪ͨ���
		for (int i = 0; i < stuffs.size(); i++) {
			((Observer) stuffs.get(i)).update();
		}
	}

	public String getMisson() {
		return misson;
	}

	public void setMisson(String misson) {
		this.misson = misson;
		notice();
	}

	public void addObserver(Observer o) {
		stuffs.add(o);

	}

	public void delObserver(Observer o) {
		stuffs.remove(o);
	}

}
