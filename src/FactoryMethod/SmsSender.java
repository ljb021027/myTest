package FactoryMethod;
/**
 * ���ŷ���ʵ����
 * @author ljb
 *
 */
public class SmsSender implements Sender{

	@Override
	public void Send() {
		System.out.println("this is SmsSender");
	}

}
