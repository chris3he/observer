package com.second;

public interface Subject {
	public void notice();//notice the change of the tribute
	public void addObserver(Observer o);
	public void delObserver(Observer o);
}
