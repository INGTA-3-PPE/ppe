package tn.arabsoft.auth.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.arabsoft.auth.Service.UserService;
import tn.arabsoft.auth.entity.LibredemandeEntity;
import tn.arabsoft.auth.entity.Personnel;
import tn.arabsoft.auth.entity.User;
import tn.arabsoft.auth.payload.request.LoginRequest;
import tn.arabsoft.auth.repository.UserRepository;
import tn.arabsoft.auth.response.JwtResponse;
import tn.arabsoft.auth.security.jwt.JwtUtils;
import tn.arabsoft.auth.security.service.UserDetailsImpl;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /*@PostMapping("/signin")
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
*/
    @PostMapping("/AddUser")
    public User createUser(@RequestBody User user) {
        user.setLogin(user.getMatricule());
        user.setRole("Personnel");
        user.setPassword(encoder.encode(user.getPassword()));
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getByMatricule/{id}")
    public User getUserByMatricule(@PathVariable String id) {
        return userService.getUserByMatricule(id);
    }

    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
    @PutMapping("/updatechef/{matricule}")
    @ResponseBody
    public ResponseEntity<User> updateA(@PathVariable String matricule) {
        User updateUser = this.userService.updateUserChef(matricule);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

}
