package ch.tbz.kinoverwaltung.server.backend;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(name = "name")
    @NonNull
    private String name;
    @Column(name = "lastname")
    @NonNull
    private String lastName;

    public Reservation() {}
}
