package Decorator;
/**
 * ����װ��������
 * Component
 * @author ljb
 *
 */
public abstract class Finery implements Animal {
	protected Animal component;

	public Finery(Animal component) {
		super();
		this.component = component;
	}
	
	public void show(){
		if(component!=null){
			component.show();
		}
	}
}
