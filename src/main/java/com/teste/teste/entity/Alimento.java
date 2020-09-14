package com.teste.teste.entity;

import java.io.Serializable;

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
@Table(name = "Alimento")
public class Alimento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "alimentoId")
	private Integer alimentoId;
	
	@Basic(optional = false)
	@Column(name = "nome")
	private String nome;
	
	@Basic(optional = false)
	@Column(name = "quantidadeCalorica")
	private Integer quantidadeCalorica;
	
	@Basic(optional = false)
	@Column(name = "grupoAlimentoId")
	private GrupoAlimento grupoAlimentoId;
}
