package tn.arabsoft.auth.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.arabsoft.auth.Service.ServiceService;
import tn.arabsoft.auth.entity.Service;


@RestController
@RequestMapping("/services")
        public class ServiceController {

            @Autowired
            private ServiceService serviceService;


    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

       
          

            @DeleteMapping("/{codServ}")
            public void deleteServiceById(@PathVariable String codServ) {
                serviceService.deleteServiceById(codServ);
            }
        }

    

