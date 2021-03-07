package ch.tbz.kinoverwaltung.server.backend;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(name = "username")
    private String username;
    @NonNull
    @Column(name = "password")
    private String password;
    @Column(name = "is_admin")
    @NonNull
    private boolean isAdmin;


    public User() {}
}
