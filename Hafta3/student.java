
public class student extends User {
	private String aldigiDersler;
	public student(int id, String firsName, String lastName, String userName, String email, String password,String aldigiDersler) {
		super(id, firsName, lastName, userName, email, password);
		this.aldigiDersler=aldigiDersler;
	}
	
	public String getAldigiDersler() {
		return aldigiDersler;
	}
	public void setAldigiDersler(String aldigiDersler) {
		this.aldigiDersler = aldigiDersler;
	}
	

}
