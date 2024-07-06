package ma.prd.students.Service;

import ma.prd.students.Dto.AbsenceDto;
import ma.prd.students.entities.Absence;
import ma.prd.students.mappers.AbsenceMapper;
import ma.prd.students.repositories.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbsenceService {
    @Autowired
    private AbsenceRepository absenceRepository;
    public List<AbsenceDto> getAllAbsences() {
        List<Absence> absences = absenceRepository.findAll();
        return absences.stream().map(AbsenceMapper.INSTANCE::absenceToDto).collect(Collectors.toList());
    }
    public void saveAbsence(AbsenceDto absenceDto){
        Absence absence=AbsenceMapper.INSTANCE.dtoToAbsence(absenceDto);
        absenceRepository.save(absence);
    }
}
