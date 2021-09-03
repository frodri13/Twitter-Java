package tech.makers.twitter.appuser;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    List<AppUser> findByUsername(String username);
}
