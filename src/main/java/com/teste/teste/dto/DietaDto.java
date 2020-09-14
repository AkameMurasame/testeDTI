package com.teste.teste.dto;

import java.util.List;

import com.teste.teste.entity.Alimento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DietaDto {

	private List<Alimento> alimentos;
	
	private Integer calorias;
}
