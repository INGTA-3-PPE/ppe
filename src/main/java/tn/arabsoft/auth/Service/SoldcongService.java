package tn.arabsoft.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.SoldcongEntity;
import tn.arabsoft.auth.repository.SoldCongRepository;

import java.util.List;
@Service
public class SoldcongService {
    @Autowired
    public SoldCongRepository soldCongRepository;

    public List<SoldcongEntity> getAllSold() {
        return this.soldCongRepository.findAll();
    }
    public void addSold(SoldcongEntity soldcongEntity) {

        this.soldCongRepository.save(soldcongEntity);
    }
    public void deleteSold(Long solde_Conge ) {

        this.soldCongRepository.deleteById(  solde_Conge);
    }
}
