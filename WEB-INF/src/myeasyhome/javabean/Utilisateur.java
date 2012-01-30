package myeasyhome.javabean;

public class Utilisateur {
	private String login ;
	private String passwd ;
	private Maison m;
	
	public Utilisateur(){
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	};
	public Maison getM() {
		return m;
	}
	public void setM(Maison m) {
		this.m = m;
	}

}
