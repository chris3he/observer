package shopping;

import java.util.Vector;

public class Goods implements GoodSubject {

	//subject实体类（被观察者）
	private Vector observers;//构造方法中必须实例化此变量不然会出现空指针异常
	private float price;
	private String name;

	public Goods()
	{
		observers=new Vector();//实例化化观察者用户表
	}
	public Goods(String name, float price) {
		observers=new Vector();
		this.price = price;
		this.name = name;
	}

	public void addObserver(Observers o) {
		observers.add(o);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		notice();
	}

	public void delObserver(Observers o) {
		observers.remove(o);
	}

	public void notice() {
		for (int i = 0; i < observers.size(); i++) {
			((Customer) observers.get(i)).update();
			((Customer)observers.get(i)).show();
		}
		
	}

}
