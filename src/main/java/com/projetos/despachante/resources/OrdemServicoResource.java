package com.projetos.despachante.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.despachante.entities.OrdemServico;
import com.projetos.despachante.services.OrdemServicoService;

@RestController
@RequestMapping(value = "/ordensservico")
public class OrdemServicoResource {
	
	@Autowired
	private OrdemServicoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrdemServico> findById(@PathVariable Long id){
		OrdemServico obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
