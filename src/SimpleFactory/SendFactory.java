package SimpleFactory;
/**
 * ���͹���
 * @author ljb
 *
 */
public class SendFactory {
	//���޸ķ���Ϊ��̬���� �����þͲ���ʵ��������
	public Sender MailProduce(){
		return new MailSender();
	}
	
	public Sender SmsProduce(){
		return new SmsSender();
	}
}
