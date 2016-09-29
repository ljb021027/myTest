package Singleton;
/**
 * �򵥵���ģʽ �̲߳���ȫ
 * @author ljb
 *
 */
public class Singleton {
	 /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
	private static Singleton singleton=null;
	
	 /* ˽�й��췽������ֹ��ʵ���� */  
	private Singleton(){
		
	}
	
	 /* ��̬���̷���������ʵ�� */  
	public static Singleton getSingleton(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
