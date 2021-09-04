package tech.makers.twitter.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser create(AppUserForm appUserForm) {
        return new AppUser(appUserForm.getName(),
                appUserForm.getUsername(),
                appUserForm.getEmail(),
                appUserForm.getPassword());
    }

    public void save(AppUser appUser){
        appUser.setLoggedIn(true);
        appUserRepository.save(appUser);
    }
}
