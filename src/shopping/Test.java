package shopping;

public class Test {//²âÊÔº¯Êý

	public static void main(String[] args) {
		Goods g=new Goods("kobe10",1000);
		Customer c1=new Customer(g,"kobe");
		Customer c2=new Customer(g,"chris");
		Customer c3=new Customer(g,"james");
		Customer c4=new Customer(g,"paul");
		g.addObserver(c1);
		g.addObserver(c2);
		g.addObserver(c3);
		g.addObserver(c4);
		g.setPrice(2000);
		g.setPrice(1999);
		g.setPrice(500);
	}
}
