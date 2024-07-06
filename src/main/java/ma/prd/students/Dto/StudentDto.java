package ma.prd.students.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class StudentDto {
    private Long id;
    private String nom;
    private String prenom;
}
