package FactoryMethod;
/**
 * �ʼ�����ʵ����
 * @author ljb
 *
 */
public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is MailSender!!!");
	}
	
}
