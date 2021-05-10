
public class UserManager {
	public void add(User user) {
		System.out.println("kullanýcý eklendi.");
	}
	public void multipleAdd(User[] user) {
		for (User users : user) {
			System.out.println(users);
			System.out.println(" ");
		}
	}
	public void girisYap(User user) {
		System.out.println("giriþ baþarýlý");
	}
	public void kaydol(User user) {
		System.out.println("kayýt baþarýlý");
	}

}
