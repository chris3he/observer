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
		System.out.println("尊敬的:" + name + "您的科比十一代降价了" + "价格低至："+priceOfyourGood);
	}

}
