package co.develhope.hibernate1.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="enrollments")
public class Enrollments {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private long id;

    @OneToMany(fetch = FetchType.LAZY) //relazione ogni iscrizione può avere più utenti
    private List<Students> list1;
    @ManyToOne // relazione ogni iscrizione può avere una classe
    private Class class1;
}
