package Proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class ProxyTest {
	public static void main(String[] args) {
		//����һ��InvocationHandler����
		InvocationHandler handler = new MyInvocationHandler();
		//ʹ��ָ����InvocationHandler�����ɶ�̬�������
		Person p =(Person) Proxy.newProxyInstance(Person.class.getClassLoader(), 
				new Class[]{Person.class}, 
				handler);
		//���ܵ��ô��������κη��� �����滻��invoke()
		p.walk();
		p.sayhello("11");
		
	}

}
