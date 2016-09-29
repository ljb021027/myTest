package Proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * InvocationHandlerʵ����
 * @author ljb
 *
 */
public class MyInvocationHandler implements InvocationHandler{
	public Object target;
	public void setTarget(Object target){
		this.target=target;
	}
	/*
	 * ִ�ж�̬�����������з���ʱ�����ᱻ�滻��ִ�����µ� invoke����
	 * ����:
	 * proxy-����̬�������
	 * method-��������ִ�еķ���
	 * args-����ִ�д�����󷽷�ʱ�����ʵ��
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		PersonUtil pu = new PersonUtil();
		pu.method1();
		//�ؼ�
		Object result = method.invoke(target, args);
		pu.method2();
		return result;
		
//		System.out.println("����ִ��"+method);
//		if(args!=null){
//			System.out.println("������ִ�и÷���ʱ�����ʵ��");
//			for(Object o:args){
//				System.out.println(o);
//			}
//		}else{
//			System.out.println("û�д���ʵ��");
//		}
//		
//		return null;
	}

}
