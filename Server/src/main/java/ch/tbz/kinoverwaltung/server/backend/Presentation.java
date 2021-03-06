package ch.tbz.kinoverwaltung.server.backend;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDateTime;

@Entity
@Table(name = "presentations")
public class Presentation {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    private long id;
    @Column(name = "start")
    private LocalDateTime start;
    @ManyToOne()
    private Film film;
}
