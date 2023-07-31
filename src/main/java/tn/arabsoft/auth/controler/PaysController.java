package tn.arabsoft.auth.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.arabsoft.auth.Service.PaysService;
import tn.arabsoft.auth.entity.Pays;

@CrossOrigin("*")
@RestController
@RequestMapping("/pays")
	public class PaysController {

	    @Autowired
	    private PaysService paysService;

	    
	    @GetMapping("/")
	    public List<Pays> getAllPays() {
	        return paysService.getAllPays();
	    }


	    @GetMapping("/{codPays}")
	    public Pays getPaysByCodPays(@PathVariable String codPays) {

			return paysService.getPaysByCodPays(codPays);
	    }

	    
	    @PostMapping("/")
	    public Pays addPays(@RequestBody Pays pays) {
	        return paysService.addPays(pays);
	    }

	    
	    @DeleteMapping("/{codPays}")
	    public void deletePays(@PathVariable String codPays) {
	        paysService.deletePays(codPays);
	    }
	}

	
	
	
	
	
	
	
	
	
	
	

