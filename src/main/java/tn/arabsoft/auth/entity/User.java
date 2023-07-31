package tn.arabsoft.auth.entity;



import java.util.Date;

import javax.persistence.*;











	@Table(name="ADMUSER", uniqueConstraints = { @UniqueConstraint(columnNames = "USE_MATRICULE"),})

	@Entity
	public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUSER")
		@SequenceGenerator(name = "seqUSER", sequenceName = "SEQ_ADMUSER", allocationSize = 1)
		@Column(name = "USE_ID")
		 private Long id;

		@Column(name = "USE_MATRICULE")
		 private String matricule;

		@Column(name = "USE_LOGIN")
		 private String login;

		@Column(name = "USE_MAIL", nullable = false)
		 private String email;

		@Column(name = "USE_PSW")
		 private String password;

		@Column(name = "USE_LNAME", nullable = false)
		 private String lastName;

		@Column(name = "USE_FNAME")
	 private String firstName;

		@Column(name = "USE_NBESSAI")
		 private Integer nbAttempts;

		@Column(name = "USE_CPTESTATUS")
		 private String accountStatus;

		@Column(name = "USE_CRTDT")
	 private Date creationDate;

		@Column(name = "USE_LASTCNX")
		 private Date lastConnectionDate;

		@Column(name = "USE_NIVADM")
		 private String adminLevel;

		@Column(name = "USE_TYPE")
		 private String userType;

		@Column(name = "USE_STATUS", columnDefinition = "VARCHAR(1) default 'N'")
	 private String status;

		@Column(name = "USE_CREDT", columnDefinition = "DATE default sysdate")
	 private Date creditDate;

		@Column(name = "USE_UPDTDT")
		 private Date updateDate;

		@Column(name = "USE_UPDTBY")
		private Long updatedBy;

		@Column(name = "COD_SOC")
		 private String companyCode;

		@Column(name = "MAT_PERS")
		 private String personnelMatricule;

		@Column(name = "COD_SITE")
		 private String siteCode;
		private  String role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public User() {
		super();
	}
	public User(String matricule, String login, String email, String password, String lastName, String firstName,
			Integer nbAttempts, String accountStatus, Date creationDate, Date lastConnectionDate, String adminLevel,
			String userType, String status, Date creditDate, Date updateDate, Long updatedBy, String companyCode,
			String personnelMatricule, String siteCode, String role) {
		super();
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