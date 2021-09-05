package tech.makers.twitter.appuser;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface AppUserRepository extends CrudRepository<AppUser, Long> {
//    @Query("SELECT u FROM app_user WHERE u.username = ?1")
  AppUser findByUsername(String username);
}
