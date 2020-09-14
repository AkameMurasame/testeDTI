package com.teste.teste.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDto {

	private Integer pacienteId;

	private String nome;

	private String endereco;

	private String email;

	private List<TelefoneDto> Telefones;
	
	private Date dataNascimento;
}
