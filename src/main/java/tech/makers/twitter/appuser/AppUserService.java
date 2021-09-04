package tech.makers.twitter.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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
}
