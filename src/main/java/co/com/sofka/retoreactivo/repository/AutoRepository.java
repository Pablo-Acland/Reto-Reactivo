package co.com.sofka.retoreactivo.repository;

import co.com.sofka.retoreactivo.model.Auto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AutoRepository extends ReactiveMongoRepository<Auto, String> {
}
