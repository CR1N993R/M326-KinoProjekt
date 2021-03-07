package ch.tbz.kinoverwaltung.server.backend;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@Table(name = "seats")
public class Seat {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(name = "name")
    @NonNull
    private String name;
    @ManyToOne
    @NonNull
    private Reservation reservation;

    public Seat() {}
}
