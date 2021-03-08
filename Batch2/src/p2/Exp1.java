package p2;

class User
{
	private String userName;
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}


public class Exp1 {
	
	public static void main(String[] args) {
		
		User us= new User();
		
		us.setUserName("abhi123");
		us.setPassword("java123");
		
		System.out.println(us.getUserName()+" "+us.getPassword());
		
	}

}
