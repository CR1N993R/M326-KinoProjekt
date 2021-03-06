package ch.tbz.kinoverwaltung.server.backend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "cinema_halls")
public class CinemaHall {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    private long id;
    @Getter @Setter
    @Column(name = "name")
    private String name;
    @Getter @Setter
    @Column(name = "columns")
    private int columns;
    @Getter @Setter
    @Column(name = "rows")
    private int rows;
    @Getter @Setter
    @OneToMany()
    private ArrayList<Presentation> presentations;
}
