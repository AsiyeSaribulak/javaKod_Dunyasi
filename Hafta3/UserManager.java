
public class UserManager {
	public void add(User user) {
		System.out.println("kullan�c� eklendi.");
	}
	public void multipleAdd(User[] user) {
		for (User users : user) {
			System.out.println(users);
			System.out.println(" ");
		}
	}
	public void girisYap(User user) {
		System.out.println("giri� ba�ar�l�");
	}
	public void kaydol(User user) {
		System.out.println("kay�t ba�ar�l�");
	}

}
