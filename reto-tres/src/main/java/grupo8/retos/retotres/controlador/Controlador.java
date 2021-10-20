package grupo8.retos.retotres.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping("/contacto")
    public String redirigir(){
        return "html/contacto";
    }
    
}
