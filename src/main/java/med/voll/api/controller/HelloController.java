package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Para identificar que é um controller
@RequestMapping("/hello")
//Para mapear a requisiçao para a porta 8080
public class HelloController {
    @GetMapping
    //Para introduzir o metodo na porta 8080
    public String olaMundo(){
        return "Hello Word";
    }
}
