
public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"Asiye","SARIBULAK","asiyeSrblk","aaaa@gmail.com","123");
		System.out.println(user1.getFirsName());
		System.out.println(user1.getLastName());
		System.out.println(user1.getPassword());
	
	User user2=new User(2,"Fatma","ABUKAN","fatmaa","aa1aa@gmail.com","1234");
	System.out.println(user2.getFirsName());
	System.out.println(user2.getLastName());
	System.out.println(user2.getPassword());
	
	User user3=new User(3,"Serkan","Aktaþ","aktasSerkan","a11aaa@gmail.com","12345");
	System.out.println(user3.getFirsName());
	System.out.println(user3.getLastName());
	System.out.println(user3.getPassword());
	
	student student1=new student(4,"Ali","KAPLAN","KaPlaN","kaplan@gmail.com","124637","java");
	StudentManager studentManager1=new StudentManager();
	studentManager1.alinanDers(student1);
	
	Instructor instructor1=new Instructor(1,"Engin","DEMÝROÐ","enginDemiroð","engindemiroð@gmail.com","456","java");
	System.out.println(instructor1.getFirsName());
	System.out.println(instructor1.getLastName());
	System.out.println(instructor1.getPassword());
	System.out.println(instructor1.getVerdigiDersler());
	
	InstructorManager instructorManager1=new InstructorManager();
	instructorManager1.dersEkle(instructor1);
	instructorManager1.girisYap(instructor1);
	
	UserManager userManager=new UserManager();
	User[] users= {user1,user2,user3,student1,instructor1};
	userManager.multipleAdd(users);
	userManager.girisYap(user3);
	userManager.kaydol(user2);
	
	
}
}
