package com.projetos.despachante.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.projetos.despachante.entities.OrdemServico;
import com.projetos.despachante.repositories.OrdemServicoRepository;
import com.projetos.despachante.services.exceptions.ResourceNotFoundException;

@Service
public class OrdemServicoService {

	@Autowired
	private OrdemServicoRepository repository;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, noRollbackFor = Exception.class)
	public OrdemServico findById(Long id){
		Optional<OrdemServico> obj = repository.findById(id);
		OrdemServico entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return entity;
	}
}
