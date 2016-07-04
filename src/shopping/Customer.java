package shopping;

public class Customer implements Observers {

	private Goods g;
	private String name;

	private float priceOfyourGood;

	public Customer(Goods g, String name) {
		this.g = g;
		this.name = name;
	}

	public void update() {
		this.priceOfyourGood = g.getPrice();
	}
	public void show() {
		update();
		System.out.println("�𾴵�:" + name + "���ĿƱ�ʮһ��������" + "�۸������"+priceOfyourGood);
	}

}
