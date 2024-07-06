package ma.prd.students.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "absence")
@Data @AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name ="sid",nullable = false)
    private Student student;
}
