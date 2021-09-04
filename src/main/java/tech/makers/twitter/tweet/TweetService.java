package tech.makers.twitter.tweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

//The glue between the controller and the repository
//Here it is the place where we store the logic
//Repositories cannot be mocked, this is why we need this layer

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private IClockService clockService;

    public List<Tweet> findAll(){
        return tweetRepository.findAll();
    }

    public Tweet create(String body){
        return new Tweet(body, LocalDateTime.now(clockService.getClock()));
    }

    public void save(Tweet tweet){
        tweetRepository.save(tweet);
    }
}
