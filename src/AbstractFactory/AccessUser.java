package AbstractFactory;

public class AccessUser implements Iuser{

	@Override
	public void Insert(User user) {
		System.out.println("Access����һ���û�");
	}

	@Override
	public User getUser(int id) {
		System.out.println("Access��ѯһ���û�");
		return null;
	}

}
