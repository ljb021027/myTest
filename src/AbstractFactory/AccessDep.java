package AbstractFactory;

public class AccessDep implements IDep{

	@Override
	public void insertDep(Dep dep) {
		System.out.println("Access����һ������");
	}

	@Override
	public Dep getDep(int id) {
		System.out.println("Access��ѯһ������");
		return null;
	}

}
