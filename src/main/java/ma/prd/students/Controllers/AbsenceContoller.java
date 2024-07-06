package ma.prd.students.Controllers;

import ma.prd.students.Dto.AbsenceDto;
import ma.prd.students.Service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AbsenceContoller {
    @Autowired
    private AbsenceService absenceService;

    @GetMapping("/")
    public String index(Model model) {
        List<AbsenceDto> absences = absenceService.getAllAbsences();
        model.addAttribute("absences", absences);
        return "index";
    }

    @PostMapping("/absence/add")
    public String addAbsence(AbsenceDto absenceDto) {
        absenceService.saveAbsence(absenceDto);
        return "redirect:/";
    }

}
