package tn.arabsoft.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;


import tn.arabsoft.auth.entity.User;
import tn.arabsoft.auth.repository.UserRepository;

@SpringBootApplication
public class AuthpfeApplication extends SpringBootServletInitializer{
	@Autowired
	  PasswordEncoder encoder;
	public static void main(String[] args) {
		SpringApplication.run(AuthpfeApplication.class, args);
	}
//	 @Bean
//	    public CommandLineRunner demoData(RoleRepository repo) {
//	        return args -> {
//	            repo.save(new Role(1, ERole.ROLE_ADMIN ));
//	            repo.save(new Role(2, ERole.ROLE_USER ));
//	            repo.save(new Role(3, ERole.ROLE_RH ));
//	        };
//	    }
	 //String username, String matricule, String email, String password, String nom, String prenom,
		//String date_naissance, String service, String emailConfirmed, String nomPrenom, String resp_dep
	 //@Bean
	  //  public CommandLineRunner demoDataUser(UserRepository repo) {
	      //  return args -> {
	           // repo.save(new User("oumaima","10081","oumaima@gmail.com",encoder.encode("123456"),"oumaimaa","aaa","date","it","oumaima@gmail.com","zzzzz","10083"));
	       // };
	   // }

}
