package co.com.sofka.retoreactivo.service;

import co.com.sofka.retoreactivo.model.Auto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AutoService {
    Mono<Auto> save(Auto auto);
    Flux<Auto> findAll();
    Mono<Auto> update(String id, Auto auto);
    Mono<Auto> delete(String id);


}
