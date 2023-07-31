package tn.arabsoft.auth.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arabsoft.auth.entity.LibredemandeEntity;

import java.util.List;

@Repository


public interface LibredemandeRepository extends JpaRepository<LibredemandeEntity, Long> {


    List<LibredemandeEntity>  findByMatricule(String matricule);
}