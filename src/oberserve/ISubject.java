package oberserve;

public interface ISubject {
	//被观察的对象需要是新的接口

	public void attachObserver(IOberserver oberserver);//添加观察者

	public void delObserver(IOberserver oberserver);//移出观察者

	public void notice();// 此方法主要用于通知观察者当被观察者的相应的属性改变的时候
}
