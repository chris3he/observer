package shopping;

import java.util.Vector;

public class Goods implements GoodSubject {

	//subjectʵ���ࣨ���۲��ߣ�
	private Vector observers;//���췽���б���ʵ�����˱�����Ȼ����ֿ�ָ���쳣
	private float price;
	private String name;

	public Goods()
	{
		observers=new Vector();//ʵ�������۲����û���
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
