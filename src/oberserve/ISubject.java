package oberserve;

public interface ISubject {
	//���۲�Ķ�����Ҫ���µĽӿ�

	public void attachObserver(IOberserver oberserver);//��ӹ۲���

	public void delObserver(IOberserver oberserver);//�Ƴ��۲���

	public void notice();// �˷�����Ҫ����֪ͨ�۲��ߵ����۲��ߵ���Ӧ�����Ըı��ʱ��
}
