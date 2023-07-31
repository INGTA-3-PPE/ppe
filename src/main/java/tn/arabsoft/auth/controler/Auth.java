package tn.arabsoft.auth.controler;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import tn.arabsoft.auth.entity.User;
import tn.arabsoft.auth.payload.request.LoginRequest;
import tn.arabsoft.auth.payload.request.SignupRequest;
import tn.arabsoft.auth.repository.UserRepository;
import tn.arabsoft.auth.response.JwtResponse;
import tn.arabsoft.auth.response.MessageResponse;
import tn.arabsoft.auth.security.jwt.JwtUtils;
import tn.arabsoft.auth.security.service.UserDetailsImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class Auth {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;



  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser( @RequestBody LoginRequest loginRequest) {

  Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getMatricule(), loginRequest.getPassword()));

   SecurityContextHolder.getContext().setAuthentication(authentication);
   String jwt = jwtUtils.generateJwtToken(authentication);
    
   UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
    //List<String> roles = userDetails.getAuthorities().stream()
     //   .map(item -> item.getAuthority())
     //  .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt, 
                         "Bearer", userDetails.getMatricule(), 
                         userDetails.getLogin(), 
                         userDetails.getEmail(),
                         userDetails.getPassword(), 
                          userDetails.getLastName(),userDetails.getFirstName(),userDetails.getNbAttempts(),userDetails.getAccountStatus(),userDetails.getCreationDate(),userDetails.getLastConnectionDate(),userDetails.getAdminLevel(),userDetails.getUserType(),userDetails.getStatus(),userDetails.getCreationDate(),userDetails.getUpdateDate(),userDetails.getUpdatedBy(),userDetails.getCompanyCode(),userDetails.getPersonnelMatricule(),userDetails.getSiteCode(),userDetails.getRole()));
 }
//	public JwtResponse(String token, String type, String matricule, String login, String email, String password,
//			String lastName, String firstName, Integer nbAttempts, String accountStatus, Date creationDate,
//			Date lastConnectionDate, String adminLevel, String userType, String status, Date creditDate,
//			Date updateDate, Long updatedBy, String companyCode, String personnelMatricule, String siteCode,
//			String role) 

 //@PostMapping("/signup")
 // public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		/*
		 * if (userRepository.existsByMatricule(signUpRequest.getMatricule())) { return
		 * ResponseEntity .badRequest() .body(new
		 * MessageResponse("Error: Username is already taken!")); }
		 */

	/*
	 * if (userRepository.existsByEmail(signUpRequest.getEmail())) { return
	 * ResponseEntity .badRequest() .body(new
	 * MessageResponse("Error: Email is already in use!")); }
	 */
    //Create new user's account
   // User user = new User( signUpRequest.getUsername(), signUpRequest.getMatricule(), signUpRequest.getEmail(), signUpRequest.getPassword(), signUpRequest.getNom(), signUpRequest.getPrenom(),
    		//signUpRequest.getDate_naissance(), signUpRequest.getService(), signUpRequest.getEmailConfirmed(), signUpRequest.getNomPrenom(), signUpRequest.getResp_dep());
    //Integer intRoles = signUpRequest.getRoles();
    //Set<Role> roles = new HashSet<>();
   // Role userRole = roleRepository.findById(intRoles)
          //  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
     //  roles.add(userRole);
		/*
//		 * if (strRoles == null) { Role userRole =
//		 * roleRepository.findByName(ERole.ROLE_USER) .orElseThrow(() -> new
//		 * RuntimeException("Error: Role is not found.")); roles.add(userRole); } else {
//		 * strRoles.forEach(role -> { switch (role) { case "admin": Role adminRole =
//		 * roleRepository.findByName(ERole.ROLE_ADMIN) .orElseThrow(() -> new
//		 * RuntimeException("Error: Role is not found.")); roles.add(adminRole);
//		 * 
//		 * break; case "mod": Role modRole =
//		 * roleRepository.findByName(ERole.ROLE_MODERATOR) .orElseThrow(() -> new
//		 * RuntimeException("Error: Role is not found.")); roles.add(modRole); break;
//		 * case "rh": Role rhRole = roleRepository.findByName(ERole.ROLE_RH)
//		 * .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//		 * roles.add(rhRole); break; default: Role userRole =
//		 * roleRepository.findByName(ERole.ROLE_USER) .orElseThrow(() -> new
//		 * RuntimeException("Error: Role is not found.")); roles.add(userRole); } }); }
//		 */
//
  //  user.setRoles(roles);
   // userRepository.save(user);

   // return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
 // }


}
