package prec.mytoDoList.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}