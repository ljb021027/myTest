import java.util.LinkedHashMap;
import java.util.Map;

public class test2 {
	public static void main(String[] args) {
		A a = new B();
//		Map map =new LinkedHashMap();
//		map.get(key)
//		map.putAll(m);
		A[] a1={new A(),new A(),new A()};
	}
}

class A {
	public String a;
	public A(){
		init();
	}
	public void init(){};
	protected void A1() {
		System.out.println("���෽��1");
	}

	public void A2() {
		System.out.println("���෽��2");
	}
}

class B extends A {
	public String b;
	public B(){
		super();
	}
	public void init(){
		System.out.println("b��init");
	}
	public void A1() {
		System.out.println("���෽��1");
	}

	public void B2() {
		System.out.println("���෽��2");
	}
}