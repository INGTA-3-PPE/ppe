package tn.arabsoft.auth.security.service;

import java.util.Collection;
import java.util.Date;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.arabsoft.auth.entity.User;

public class UserDetailsImpl implements UserDetails {
	 private Long id;


	    private String matricule;

	    private String login;

	    private String email;
	    @JsonIgnore
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
	     

	public UserDetailsImpl(String matricule, String login, String email, String password, String lastName,
				String firstName, Integer nbAttempts, String accountStatus, Date creationDate, Date lastConnectionDate,
				String adminLevel, String userType, String status, Date creditDate, Date updateDate, Long updatedBy,
				String companyCode, String personnelMatricule, String siteCode, String role) {
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

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {

		        return null;

		}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return matricule;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	public UserDetailsImpl() {
		super();
	}
//	String matricule, String login, String email, String password, String lastName, String firstName,
//	Integer nbAttempts, String accountStatus, Date creationDate, Date lastConnectionDate, String adminLevel,
//	String userType, String status, Date creditDate, Date updateDate, Long updatedBy, String companyCode,
//	String personnelMatricule, String siteCode, String role
	public static UserDetailsImpl build(User user) {
		

		return new UserDetailsImpl(user.getMatricule(), user.getLogin(), user.getEmail(), user.getPassword(), user.getLastName(),
				user.getFirstName(), user.getNbAttempts(), user.getAccountStatus(),user.getCreationDate(), user.getLastConnectionDate(),
				user.getAdminLevel(), user.getUserType(), user.getStatus(),user.getCreditDate(), user.getUpdateDate(), user.getUpdatedBy(),
				user.getCompanyCode(), user.getPersonnelMatricule(), user.getSiteCode(), user.getRole());
	}
//	private Integer id;
//
//	private String username;
//	private String matricule;
//
//	private String email;
//	@JsonIgnore
//	private String password;
//
//	private String nom;
//
//	private String prenom;
//	
//	
//	
//
//	private String date_naissance;
//	
//	private String service;
//	private String EmailConfirmed;
//	
//	
//	
//	private String NomPrenom;
//	
//	
//	
//	private String resp_dep;
//	private Collection<? extends GrantedAuthority> authorities;
//
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return authorities;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return password;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return username;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	public static UserDetailsImpl build(User user) {
//	    List<GrantedAuthority> authorities = user.getRoles().stream()
//	        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
//	        .collect(Collectors.toList());
//
//    return new UserDetailsImpl(
//        user.getId(), 
//        user.getUsername(),user.getMatricule(), 
//        user.getEmail(),
//        user.getPassword(), 
//        user.getNom(),user.getPrenom(),user.getDate_naissance(),user.getService(),user.getEmailConfirmed(),user.getNomPrenom(),user.getResp_dep(),authorities);
//  }
//	
//
//	public UserDetailsImpl() {
//		super();
//	}
//
//	public UserDetailsImpl(Integer id, String username, String matricule, String email, String password, String nom,
//			String prenom, String date_naissance, String service, String emailConfirmed, String nomPrenom,
//			String resp_dep, Collection<? extends GrantedAuthority> authorities) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.matricule = matricule;
//		this.email = email;
//		this.password = password;
//		this.nom = nom;
//		this.prenom = prenom;
//		this.date_naissance = date_naissance;
//		this.service = service;
//		EmailConfirmed = emailConfirmed;
//		NomPrenom = nomPrenom;
//		this.resp_dep = resp_dep;
//		this.authorities = authorities;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getMatricule() {
//		return matricule;
//	}
//
//	public void setMatricule(String matricule) {
//		this.matricule = matricule;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public String getPrenom() {
//		return prenom;
//	}
//
//	public void setPrenom(String prenom) {
//		this.prenom = prenom;
//	}
//
//	public String getDate_naissance() {
//		return date_naissance;
//	}
//
//	public void setDate_naissance(String date_naissance) {
//		this.date_naissance = date_naissance;
//	}
//
//	public String getService() {
//		return service;
//	}
//
//	public void setService(String service) {
//		this.service = service;
//	}
//
//	public String getEmailConfirmed() {
//		return EmailConfirmed;
//	}
//
//	public void setEmailConfirmed(String emailConfirmed) {
//		EmailConfirmed = emailConfirmed;
//	}
//
//	public String getNomPrenom() {
//		return NomPrenom;
//	}
//
//	public void setNomPrenom(String nomPrenom) {
//		NomPrenom = nomPrenom;
//	}
//
//	public String getResp_dep() {
//		return resp_dep;
//	}
//
//	public void setResp_dep(String resp_dep) {
//		this.resp_dep = resp_dep;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
//		this.authorities = authorities;
//	}
//	
//	
//
//}}

public UserDetailsImpl(Long id, String matricule, String login, String email, String password, String lastName,
		String firstName, Integer nbAttempts, String accountStatus, Date creationDate, Date lastConnectionDate,
		String adminLevel, String userType, String status, Date creditDate, Date updateDate, Long updatedBy,
		String companyCode, String personnelMatricule, String siteCode, String role) {
	super();
	this.id = id;
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
