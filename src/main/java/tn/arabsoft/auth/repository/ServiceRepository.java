package tn.arabsoft.auth.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arabsoft.auth.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {
	List<Service> findByTypeServ(String typeServ);
}
