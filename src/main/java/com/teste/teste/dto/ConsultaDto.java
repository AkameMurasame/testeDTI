package com.teste.teste.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultaDto {

	private Date data;
	private String horário;
	private Double peso;
	private String gorduraCorporal;
	private String sensacaoFisica;
	private List<RestricoesAlimentaresDto> restricoesAlimentares;
}
