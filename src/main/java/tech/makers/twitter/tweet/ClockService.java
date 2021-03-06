package tech.makers.twitter.tweet;

import org.springframework.stereotype.Service;

import java.time.Clock;

@Service
public class ClockService implements IClockService {
    private Clock clock;

    ClockService(){
        this.clock = Clock.systemUTC();
    }

    public Clock getClock() {
        return this.clock;
    }
}
