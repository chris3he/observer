package com.second;

import java.util.Vector;

public class Manager implements Subject {

	private Vector stuffs;// stuffs managed by this manager
	private String misson;// misson of this week
	private String location;//任务地点
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
	public void notice() {// notice()发现就是每次都会检查一遍，没改动的话update也会执行，只是结果不变而已，有改动就改变相应的通知结果
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
