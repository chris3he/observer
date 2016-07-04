package com.second;

import oberserve.Teacher;

public class Stuff implements Observer {
	private String mission;
	private String location;
	private String name;
	private Manager manager;

	public Stuff(String name, Manager m) {
		this.name = name;
		this.manager = m;
	}

	public void update() {

		mission = manager.getMisson();
		location = manager.getLocation();
	}

	public void show() {
		System.out.println("场上位置：" + name + "      " + "任务：" + mission + "       " + "任务地点:" + location);
	}
}
