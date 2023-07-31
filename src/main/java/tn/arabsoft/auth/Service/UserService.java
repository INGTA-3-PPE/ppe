package tn.arabsoft.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.LibredemandeEntity;
import tn.arabsoft.auth.entity.Personnel;
import tn.arabsoft.auth.entity.User;
import tn.arabsoft.auth.repository.PersonnelRepository;
import tn.arabsoft.auth.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    public UserRepository userRepository;
@Autowired
public PersonnelRepository personnelRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user)

    {
        Personnel personnel=new Personnel();
        personnel.setMatricule(user.getMatricule());
        personnel.setNom(user.getLastName());
        personnel.setCOD_SOC("1");
        personnelRepository.save(personnel);
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    public User getUserByMatricule(String id) {
        User user;
        Optional< User> user1 = this.userRepository.findByMatricule(id);
        user=user1.get();
        return user;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);}
    public User updateUserChef(User user) {
        //personnel.setDateNaissance(new Date());
        user.setRole("chef");
        return this.userRepository.save(user);
    }

    public User updateUserChef(String id) {
        User  user = new User();
       Optional< User> user1 = this.userRepository.findByMatricule(id);
        user=user1.get();
       user.setRole("chef");
        return  this.userRepository.save(user);
    }
  
    }
    
    



