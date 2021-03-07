package ch.tbz.kinoverwaltung.server.backend;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "cinema_halls")
public class CinemaHall {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(name = "name")
    @NonNull
    private String name;
    @Column(name = "column_amount")
    @NonNull
    private int columns;
    @NonNull
    @Column(name = "row_amount")
    private int rows;
    @OneToMany()
    private List<Presentation> presentations = new ArrayList<>();

    public CinemaHall() {}
}
