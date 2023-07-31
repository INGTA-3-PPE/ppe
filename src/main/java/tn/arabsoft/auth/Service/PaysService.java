package tn.arabsoft.auth.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.Pays;
import tn.arabsoft.auth.repository.PaysRepository;


@Service
public class PaysService {
	@Autowired
	private PaysRepository paysRepository;

	public List<Pays> getAllPays() {
	    return paysRepository.findAll();
	}

	public Pays getPaysByCodPays(String codPays) {
	    return paysRepository.findById(codPays).orElse(null);
	}

	public Pays addPays(Pays pays) {
	    return paysRepository.save(pays);
	}

	public void deletePays(String codPays) {
	    paysRepository.deleteById(codPays);
	}


}