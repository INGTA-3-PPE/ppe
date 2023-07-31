package tn.arabsoft.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.arabsoft.auth.entity.Societe;

@Repository
public interface SocieteRepository extends JpaRepository<Societe, String>{
	 List<Societe> findAll();
	    Optional<Societe> findById(String id);
	  
	    void deleteById(String id);
}
