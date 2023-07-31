package tn.arabsoft.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.repository.ServiceRepository;

import java.util.List;


@Service
    public class ServiceService {

        @Autowired
        private ServiceRepository serviceRepository;

   

        public List<tn.arabsoft.auth.entity.Service> getAllServices() {
            return serviceRepository.findAll();
        }


        public void deleteServiceById(String codServ) {
            serviceRepository.deleteById(codServ);
        }
    }

    
    

