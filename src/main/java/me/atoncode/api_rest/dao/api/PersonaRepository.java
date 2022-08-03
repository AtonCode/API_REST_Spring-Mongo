package me.atoncode.api_rest.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.atoncode.api_rest.model.Persona;

public interface PersonaRepository extends MongoRepository<Persona, Long> {

}
