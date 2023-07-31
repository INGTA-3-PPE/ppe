package tn.arabsoft.auth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arabsoft.auth.entity.SoldcongEntity;

@Repository
public interface SoldCongRepository extends JpaRepository<SoldcongEntity,Long> {



}

