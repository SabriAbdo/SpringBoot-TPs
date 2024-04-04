package ma.emsi.hopital.views;


import lombok.AllArgsConstructor;
import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@AllArgsConstructor
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;


    @GetMapping("/index")
    public String index(Model model , @RequestParam (name =  "page",defaultValue = "0") int p ,
                        @RequestParam (name =  "size",defaultValue = "4") int s){
        Page<Patient> pagePatients = patientRepository.findAll(PageRequest.of(p,s));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int [pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",p);
        return "patients";
    }

    @GetMapping("/delete")
    public String delete(Long id){
        patientRepository.deleteById(id);
        return "redirect:/index";
    }
}
