
package nicoangeletti.ConsultoraEmpresas.controller;

import nicoangeletti.ConsultoraEmpresas.service.IPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreguntaController {
    
    
    @Autowired
    IPreguntaService preguntaServ;
    
    
}
