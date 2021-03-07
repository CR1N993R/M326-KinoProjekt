package ch.tbz.kinoverwaltung.server.backend;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "presentations")
public class Presentation {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(name = "start")
    @NonNull
    private LocalDateTime start;
    @ManyToOne()
    @NonNull
    private Film film;
    @OneToMany
    private List<Seat> seats = new ArrayList<>();

    public Presentation() {}
}
