package co.develhope.hibernate1.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="classes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Class {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private long id;

    @Column(name="Title", nullable = false)
    private String title;

    @Column(name="Description", nullable = false)
    private String description;
}
