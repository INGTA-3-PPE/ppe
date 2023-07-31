package tn.arabsoft.auth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arabsoft.auth.entity.EtatpaieEntity;

@Repository
public interface EtatpaieRepository  extends JpaRepository<EtatpaieEntity, Long> {
}
