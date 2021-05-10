
public class Instructor extends User {
	private String verdigiDersler;

	public Instructor(int id, String firsName, String lastName, String userName, String email, String password,String verdigiDersler) {
		super(id, firsName, lastName, userName, email, password);
		this.verdigiDersler=verdigiDersler;
	}
	
	public String getVerdigiDersler() {
		return verdigiDersler;
	}
	public void setVerdigiDersler(String verdigiDersler) {
		this.verdigiDersler = verdigiDersler;
	}
	
	

}
