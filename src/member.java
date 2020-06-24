
public class member {
	private String uname, password;

	public member(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public member() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
}
