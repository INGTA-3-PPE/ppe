package tn.arabsoft.auth.payload.request;

public class LoginRequest {
	private String matricule;
	private String password;
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginRequest() {
		super();
	}
	public LoginRequest(String matricule, String password) {
		super();
		this.matricule = matricule;
		this.password = password;
	}

}
