package Decorator;
/**
 * ��װ�ε�ԭʼ��
 * ConcreteComponent 
 * @author ljb
 *
 */
public class Person implements Animal {
	public Person() {

	}

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void show() {
		System.out.println(name+"show");
	}

}
