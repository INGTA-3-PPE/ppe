package tn.arabsoft.auth.response;

import java.util.Date;
import java.util.List;

public class JwtResponse {
	 private String token;
	  private String type = "Bearer";



	    private String matricule;

	    private String login;

	    private String email;

	    private String password;

	    private String lastName;

	    private String firstName;

	    private Integer nbAttempts;

	    private String accountStatus;

	    private Date creationDate;

	    private Date lastConnectionDate;

	    private String adminLevel;

	   
	    private String userType;

	    private String status;

	    private Date creditDate;

	    private Date updateDate;

	    private Long updatedBy;

	    private String companyCode;

	    private String personnelMatricule;

	     private String siteCode;
	     private String role;
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getMatricule() {
			return matricule;
		}
		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public Integer getNbAttempts() {
			return nbAttempts;
		}
		public void setNbAttempts(Integer nbAttempts) {
			this.nbAttempts = nbAttempts;
		}
		public String getAccountStatus() {
			return accountStatus;
		}
		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}
		public Date getCreationDate() {
			return creationDate;
		}
		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}
		public Date getLastConnectionDate() {
			return lastConnectionDate;
		}
		public void setLastConnectionDate(Date lastConnectionDate) {
			this.lastConnectionDate = lastConnectionDate;
		}
		public String getAdminLevel() {
			return adminLevel;
		}
		public void setAdminLevel(String adminLevel) {
			this.adminLevel = adminLevel;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Date getCreditDate() {
			return creditDate;
		}
		public void setCreditDate(Date creditDate) {
			this.creditDate = creditDate;
		}
		public Date getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}
		public Long getUpdatedBy() {
			return updatedBy;
		}
		public void setUpdatedBy(Long updatedBy) {
			this.updatedBy = updatedBy;
		}
		public String getCompanyCode() {
			return companyCode;
		}
		public void setCompanyCode(String companyCode) {
			this.companyCode = companyCode;
		}
		public String getPersonnelMatricule() {
			return personnelMatricule;
		}
		public void setPersonnelMatricule(String personnelMatricule) {
			this.personnelMatricule = personnelMatricule;
		}
		public String getSiteCode() {
			return siteCode;
		}
		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public JwtResponse(String token, String type, String matricule, String login, String email, String password,
				String lastName, String firstName, Integer nbAttempts, String accountStatus, Date creationDate,
				Date lastConnectionDate, String adminLevel, String userType, String status, Date creditDate,
				Date updateDate, Long updatedBy, String companyCode, String personnelMatricule, String siteCode,
				String role) {
			super();
			this.token = token;
			this.type = type;
			this.matricule = matricule;
			this.login = login;
			this.email = email;
			this.password = password;
			this.lastName = lastName;
			this.firstName = firstName;
			this.nbAttempts = nbAttempts;
			this.accountStatus = accountStatus;
			this.creationDate = creationDate;
			this.lastConnectionDate = lastConnectionDate;
			this.adminLevel = adminLevel;
			this.userType = userType;
			this.status = status;
			this.creditDate = creditDate;
			this.updateDate = updateDate;
			this.updatedBy = updatedBy;
			this.companyCode = companyCode;
			this.personnelMatricule = personnelMatricule;
			this.siteCode = siteCode;
			this.role = role;
		}

	
	

}
