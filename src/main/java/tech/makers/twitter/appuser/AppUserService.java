package tech.makers.twitter.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser create(AppUserForm appUserForm) {
        String encryptedPassword = passwordEncoder.encode(appUserForm.getPassword());

        return new AppUser(appUserForm.getName(),
                appUserForm.getUsername(),
                appUserForm.getEmail(),
                encryptedPassword);
    }

    public void save(AppUser appUser){
        appUser.setLoggedIn(true);
        appUserRepository.save(appUser);
    }

    public Optional<AppUser> loadUserByUsename(String username){
        return appUserRepository.findByUsername(username);
    }

    public void login(AppUserForm appUserForm){
        String username = appUserForm.getUsername();
        String password = appUserForm.getPassword();

        if (loadUserByUsename(username).isPresent()) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }
}
