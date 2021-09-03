package tech.makers.twitter.appuser;

import javax.persistence.*;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Transient
    private boolean isLoggedIn;

    protected AppUser() {}

    public AppUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


}
