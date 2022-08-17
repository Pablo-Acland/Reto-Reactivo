package co.com.sofka.retoreactivo.controllers;


import co.com.sofka.retoreactivo.model.Auto;
import co.com.sofka.retoreactivo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private Mono<Auto> saveAuto(@RequestBody Auto auto) {
        return this.autoService.save(auto);
    }

    @GetMapping(value = "/Autos")
    private Flux<Auto> findAll() {
        return this.autoService.findAll();
    }

    @GetMapping(value = "/Auto/{id}")
    private Mono<Auto> findById(@PathVariable("id") String id) {
        return this.autoService.findById(id);
    }
    


    @PutMapping("/auto/update/{id}")
    public Mono<ResponseEntity<Auto>> updateAuto(@PathVariable("id") String id, @RequestBody Auto auto) {
        return this.autoService.update(id, auto).flatMap(auto1 -> Mono.just(ResponseEntity.ok(auto1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/auto/delete/{id}")
    private Mono<ResponseEntity<Auto>> deleteAuto(@PathVariable("id") String id) {
        return this.autoService.delete(id).flatMap(auto1 -> Mono.just(ResponseEntity.ok(auto1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

}
