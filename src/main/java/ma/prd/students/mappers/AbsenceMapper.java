package ma.prd.students.mappers;

import ma.prd.students.Dto.AbsenceDto;
import ma.prd.students.Dto.StudentDto;
import ma.prd.students.entities.Absence;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AbsenceMapper {
    AbsenceMapper INSTANCE = Mappers.getMapper(AbsenceMapper.class);

    AbsenceDto absenceToDto (Absence absence);
    Absence dtoToAbsence(AbsenceDto absenceDto);
}
