package com.teste.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.dto.PacienteDto;
import com.teste.teste.service.PacienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/paciente")
public class PacienteController {

	@Autowired
	private PacienteService _pacienteService;
	
	@PostMapping("/cadastro")
	public PacienteDto insertPaciente(PacienteDto paciente) {
		return _pacienteService.insert(paciente);
		
	}
}
