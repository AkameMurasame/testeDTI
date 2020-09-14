package com.teste.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.dto.ConsultaDto;
import com.teste.teste.entity.Alimento;
import com.teste.teste.entity.Consulta;
import com.teste.teste.entity.GrupoAlimento;
import com.teste.teste.entity.RestricoesAlimentares;
import com.teste.teste.repository.AlimentoRepository;
import com.teste.teste.repository.ConsultaRepository;
import com.teste.teste.repository.GrupoAlimentoRepository;
import com.teste.teste.repository.RestricoesAlimentaresRepository;

@Service
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	private ConsultaRepository _consultaRepository;

	@Autowired
	private RestricoesAlimentaresRepository _restricoesAlimentaresRepository;
	
	@Autowired 
	private AlimentoRepository _alimentoRepository;
	
	@Autowired
	private GrupoAlimentoRepository _grupoAlimentoRepository;

	@Override
	public ConsultaDto insert(ConsultaDto consulta) {
		Consulta consultaEntity = _consultaRepository.save(Consulta.builder().data(consulta.getData())
				.gorduraCorporal(consulta.getGorduraCorporal()).horário(consulta.getHorário()).peso(consulta.getPeso())
				.sensacaoFisica(consulta.getSensacaoFisica()).build());
		if (!consulta.getRestricoesAlimentares().isEmpty()) {
			consulta.getRestricoesAlimentares().forEach(e -> {
				_restricoesAlimentaresRepository.save(
						RestricoesAlimentares.builder().descricao(e.getDescricao()).consultaId(consultaEntity).build());
			});
		}
		return consulta;
	}
	
	public void MontarDieta(Integer calorias) {
		List<GrupoAlimento> grupoAlimentos = _grupoAlimentoRepository.getFirstGrupoAlimento();
		
		Integer restoCalorias = calorias;
		
		alimentos.forEach(e -> {
			if(e.getQuantidadeCalorica() < restoCalorias) {
				
			}
		});
	}
}
