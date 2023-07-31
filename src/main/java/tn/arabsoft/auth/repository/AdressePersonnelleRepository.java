package tn.arabsoft.auth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arabsoft.auth.entity.AdressePersonnelle;

@Repository
public interface AdressePersonnelleRepository extends JpaRepository<AdressePersonnelle, Integer>  {
	 
}
