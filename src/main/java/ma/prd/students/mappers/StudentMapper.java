package ma.prd.students.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers; // Assurez-vous d'importer la classe Mappers

import ma.prd.students.Dto.StudentDto;
import ma.prd.students.entities.Student;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto studentToDto(Student student);
    Student studentDtoToEntity(StudentDto studentDto); // Correction de la méthode
}
