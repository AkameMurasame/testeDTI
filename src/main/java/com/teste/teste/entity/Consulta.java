package com.teste.teste.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Consulta")
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "consultaId")
	private Integer consultaId;		
	
	@Basic(optional = false)
	@Column(name = "data")
	private Date data;
	
	@Basic(optional = false)
	@Column(name = "horário")
	private String horário;
	
	@Basic(optional = false)
	@Column(name = "peso")
	private Double peso;
	
	@Basic(optional = false)
	@Column(name = "gorduraCorporal")
	private String gorduraCorporal;
	
	@Basic(optional = false)
	@Column(name = "sensacaoFisica")
	private String sensacaoFisica;
	
	@Basic(optional = false)
	@Column(name = "pacienteId")
	private Paciente pacienteId;
}
