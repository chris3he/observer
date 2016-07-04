package shopping;

public interface GoodSubject {

	public void addObserver(Observers o);
	public void delObserver(Observers o);
	public void notice();
}
