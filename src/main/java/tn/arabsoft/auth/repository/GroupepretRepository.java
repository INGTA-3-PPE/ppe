package tn.arabsoft.auth.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arabsoft.auth.entity.GroupepetPK;
import tn.arabsoft.auth.entity.GroupepretEntity;

@Repository
public interface GroupepretRepository extends JpaRepository<GroupepretEntity, GroupepetPK> {
}
