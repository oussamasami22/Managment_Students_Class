package ma.prd.students.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "student")
@Data @NoArgsConstructor@AllArgsConstructor @Getter @Setter @Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;


}
