package SimpleFactory;

public class test {
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		//ֻ�øĶ����������ù����Ĳ�ͬ����
		Sender sender = sendFactory.MailProduce();
		sender.Send();
	}
	
}
