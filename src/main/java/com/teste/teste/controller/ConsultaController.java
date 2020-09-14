package com.teste.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.dto.ConsultaDto;
import com.teste.teste.service.ConsultaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaService _consultaService;
	
	@PostMapping("/cadastro")
	public ConsultaDto insertPaciente(ConsultaDto consulta) {
		return _consultaService.insert(consulta);
		
	}
}
