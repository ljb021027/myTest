package AbstractFactory;

public class SqlserverUser implements Iuser{

	@Override
	public void Insert(User user) {
		System.out.println("Sqlserver����һ���û�");
	}

	@Override
	public User getUser(int id) {
		System.out.println("Sqlserver��ѯһ���û�");
		return null;
	}

}
