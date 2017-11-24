package org.springframework.samples.petclinic.user;

import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class UserController {

    private final UserRepository users;

    @Autowired
    public UserController(UserRepository clinicService) {
        this.users = clinicService;
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "users/login";
    }

//    @GetMapping("/login.html")
//    public String showVetList(Map<String, Object> model) {
//        // Here we are returning an object of type 'Vets' rather than a collection of Vet
//        // objects so it is simpler for Object-Xml mapping
//        Vets vets = new Vets();
//        vets.getVetList().addAll(this.vets.findAll());
//        model.put("vets", vets);
//        return "vets/vetList";
//    }
//
//    @GetMapping({ "/vets.json", "/vets.xml" })
//    public @ResponseBody Vets showResourcesVetList() {
//        // Here we are returning an object of type 'Vets' rather than a collection of Vet
//        // objects so it is simpler for JSon/Object mapping
//        Vets vets = new Vets();
//        vets.getVetList().addAll(this.vets.findAll());
//        return vets;
//    }

}
