package tn.arabsoft.auth.entity;

import javax.persistence.*;

	@Entity
		public class Pays {
		    @Id
		    @Column(name = "COD_PAYS")
		    private String codPays;

		    @Column(name = "LIB_PAYS")
		    private String libPays;

		    @Column(name = "ABRV_PAYS")
		    private String abrvPays;

		    @Column(name = "CONTINENT")
		    private String continent;

			public String getCodPays() {
				return codPays;
			}

			public void setCodPays(String codPays) {
				this.codPays = codPays;
			}

			public String getLibPays() {
				return libPays;
			}

			public void setLibPays(String libPays) {
				this.libPays = libPays;
			}

			public String getAbrvPays() {
				return abrvPays;
			}

			public void setAbrvPays(String abrvPays) {
				this.abrvPays = abrvPays;
			}

			public String getContinent() {
				return continent;
			}

			public void setContinent(String continent) {
				this.continent = continent;
			}

			@Override
			public String toString() {
				return "Pays [codPays=" + codPays + ", libPays=" + libPays + ", abrvPays=" + abrvPays + ", continent="
						+ continent + "]";
			}

		public Pays() {
		}


	}
		  