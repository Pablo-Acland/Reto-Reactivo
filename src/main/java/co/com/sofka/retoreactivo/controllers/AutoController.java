package co.com.sofka.retoreactivo.controllers;


import co.com.sofka.retoreactivo.model.Auto;
import co.com.sofka.retoreactivo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class AutoController {

    @Autowired
    AutoService autoService;

    @PostMapping("/auto")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Auto> saveCliente(@RequestBody Auto auto) {
        return this.autoService.save(auto);
    }

    @GetMapping(value = "/Autos")
    private Flux<Auto> findAll() {
        return this.autoService.findAll();
    }

}
