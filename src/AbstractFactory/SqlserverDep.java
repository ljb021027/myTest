package AbstractFactory;

public class SqlserverDep implements IDep{

	@Override
	public void insertDep(Dep dep) {
		System.out.println("sqlserver����һ������");
	}

	@Override
	public Dep getDep(int id) {
		System.out.println("sqlserver��ѯһ������");
		return null;
	}

}
