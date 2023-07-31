package tn.arabsoft.auth.entity;


import javax.persistence.*;


@Entity
public class EtatpaieEntity {
	@Id
	@GeneratedValue(
			strategy= GenerationType.IDENTITY,
			generator= "Code_Etat"
	)
	@Column(
			name = "COD_ETAT",
			updatable = false
	)

	private Long Code_Etat;

	@Column(
			name = "LIB_ETAT",
			updatable = false
	)

	private String Libre_etat;

	public EtatpaieEntity(Long code_Etat, String libre_etat) {
		Code_Etat = code_Etat;
		Libre_etat = libre_etat;
	}

	public EtatpaieEntity() {
	}

	public Long getCode_Etat() {
		return Code_Etat;
	}

	public void setCode_Etat(Long code_Etat) {
		Code_Etat = code_Etat;
	}

	public String getLibre_etat() {
		return Libre_etat;
	}

	public void setLibre_etat(String libre_etat) {
		Libre_etat = libre_etat;
	}
}

  


