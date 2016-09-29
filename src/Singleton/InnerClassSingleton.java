package Singleton;

public class InnerClassSingleton {
	/* ˽�й��췽������ֹ��ʵ���� */
	private InnerClassSingleton() {

	}

	/* ��ȡʵ�� */
	public static Singleton getInstance() {
		return Singleton.singleton;
	}

	/* �˴�ʹ��һ���ڲ�����ά������ */
	private static class Singleton {
		protected static Singleton singleton = new Singleton();
	}

	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
	public Object readResolve() {
		return getInstance();
	}
}
