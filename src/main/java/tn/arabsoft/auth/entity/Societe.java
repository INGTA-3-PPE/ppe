package tn.arabsoft.auth.entity;

import java.util.Map;

import javax.persistence.*;
@Table(name = "SOCIETE")
@Entity
	public class Societe {
	    
	@Id
	@Column(name = "COD_SOC")
	private String codSoc;

	@Column(name = "COD_POST")
	private String codPost;

	@Column(name = "LIB_SOC")
	private String libSoc;

	@Column(name = "ABRV_SOC")
	private String abrvSoc;

	@Column(name = "RUE_SOC")
	private String rueSoc;

	@Column(name = "VILLE_SOC")
	private String villeSoc;

	@Column(name = "PAYS_SOC")
	private String paysSoc;

	@Column(name = "TEL_SOC")
	private String telSoc;

	@Column(name = "FAX_SOC")
	private String faxSoc;

	@Column(name = "COD_TVA")
	private String codTva;

	@Column(name = "NUM_RETR")
	private String numRetr;

	@Column(name = "WEB")
	private String web;

	@Column(name = "MAX_AGE")
	private Integer maxAge;

	@Column(name = "MIN_AGE")
	private Integer minAge;

	@Column(name = "COD_RETR")
	private String codRetr;

	@Lob
	@Column(name = "SIG_SOC")
	private byte[] sigSoc;

	@Column(name = "ADR_ELC")
	private String adrElc;

	public Map<String, ?> getCodSoc() {
		// TODO Auto-generated method stub
		return null;
	}

	// Getters and Setters


	public Societe() {
	}
}