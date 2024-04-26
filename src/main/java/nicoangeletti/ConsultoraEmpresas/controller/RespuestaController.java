
package nicoangeletti.ConsultoraEmpresas.controller;

import nicoangeletti.ConsultoraEmpresas.service.IRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RespuestaController {
    
    
    @Autowired
    IRespuestaService respuestaServ;
    
}
