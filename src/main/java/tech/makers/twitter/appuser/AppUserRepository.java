package tech.makers.twitter.appuser;

import org.springframework.data.repository.CrudRepository;
import tech.makers.twitter.tweet.Tweet;

import java.util.List;
import java.util.Optional;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
