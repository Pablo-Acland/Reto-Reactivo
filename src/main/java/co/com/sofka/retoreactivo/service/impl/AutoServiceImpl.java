package co.com.sofka.retoreactivo.service.impl;

import co.com.sofka.retoreactivo.model.Auto;
import co.com.sofka.retoreactivo.repository.AutoRepository;
import co.com.sofka.retoreactivo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class AutoServiceImpl implements AutoService {


    @Autowired
    AutoRepository autoRepository;

    @Override
    public Mono<Auto> save(Auto auto) {
        return autoRepository.save(auto);
    }

    @Override
    public Flux<Auto> findAll() {
        return autoRepository.findAll();
    }

    @Override
    public Mono<Auto> update(String id, Auto auto) {
        return null;
    }

    @Override
    public Mono<Auto> delete(String id) {
        return null;
    }
}
