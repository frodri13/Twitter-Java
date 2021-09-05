package tech.makers.twitter.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserService{
    private final static String USER_NOT_FOUND_MSG =
            "User with username %s not found";
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
        appUserRepository.save(appUser);
    }

    public AppUser loadUserByUsername(String username){
        return appUserRepository.findByUsername(username);
    }

    public void login(AppUserForm appUserForm){
        String username = appUserForm.getUsername();
        String password = appUserForm.getPassword();
        AppUser dbUser = loadUserByUsername(username);

        if (dbUser == null) {
            throw new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, username));
        } else {
            if (passwordEncoder.matches(password, dbUser.getPassword())) {
                dbUser.setLoggedIn(true);
                appUserRepository.save(dbUser);
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}
