package co.develhope.hibernate1.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private long id;

    @Column(name="First Name", nullable = false)
    private String firstName;

    @Column(name="Last Name", nullable = false)
    private String lastName;

    @Column(name="userEmail", unique = true, nullable = false)
    private String email;
}
