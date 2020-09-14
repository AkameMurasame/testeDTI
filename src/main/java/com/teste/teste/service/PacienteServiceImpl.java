package com.teste.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.dto.PacienteDto;
import com.teste.teste.entity.Paciente;
import com.teste.teste.entity.Telefone;
import com.teste.teste.repository.PacienteRepository;
import com.teste.teste.repository.TelefoneRepository;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository _pacienteRepository;

	@Autowired
	private TelefoneRepository _telefoneRepository;

	@Override
	public PacienteDto insert(PacienteDto paciente) {
		try {
			Paciente pacienteEntity = _pacienteRepository
					.save(Paciente.builder().dataNascimento(paciente.getDataNascimento()).email(paciente.getEmail())
							.endereco(paciente.getEndereco()).nome(paciente.getNome()).build());
			if (!paciente.getTelefones().isEmpty()) {
				paciente.getTelefones().forEach(e -> {
					Telefone telefone = Telefone.builder().pacienteId(pacienteEntity).telefone(e.getTelefone()).build();
					_telefoneRepository.save(telefone);
				});
			}
		} catch (Exception e) {
			throw e;
		}
		return paciente;
	}
}
