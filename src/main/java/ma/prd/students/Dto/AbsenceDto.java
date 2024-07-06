package ma.prd.students.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
public class AbsenceDto {
    private Long id;
    private LocalDate date;
    private Long sid;

}
