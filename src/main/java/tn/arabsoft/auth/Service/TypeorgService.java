package tn.arabsoft.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.TypeorgEntity;
import tn.arabsoft.auth.repository.TypeorgRepository;

import java.util.List;
@Service
public class TypeorgService {
    @Autowired
    public TypeorgRepository typeorgRepository;

    public List<TypeorgEntity> getAlltypeorg() {
        return this.typeorgRepository.findAll();
    }
    public void addTypeorg(TypeorgEntity typeorgEntity) {

        this.typeorgRepository.save(typeorgEntity);
    }
    public void deleteTypeorg(Long type_org) {

        this.typeorgRepository.deleteById(  type_org);
    }
}
