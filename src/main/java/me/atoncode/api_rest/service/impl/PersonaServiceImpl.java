package me.atoncode.api_rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import me.atoncode.api_rest.commons.GenericServiceImpl;
import me.atoncode.api_rest.dao.api.PersonaRepository;
import me.atoncode.api_rest.model.Persona;
import me.atoncode.api_rest.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaRepository;
	}

}
