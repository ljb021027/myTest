package Decorator;
/**
 * ����װ����
 * 
 * @author ljb
 *
 */
public class Txu extends Finery{
	
	public Txu(Animal animal){
		super(animal);
	}
	
	public void show(){
		System.out.println("��T��");
		super.show();
	}
}
