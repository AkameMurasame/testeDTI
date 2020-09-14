package com.teste.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teste.teste.entity.GrupoAlimento;

@Repository
public interface GrupoAlimentoRepository extends JpaRepository<GrupoAlimento, Integer>{

	@Query("SELECT MIN(a.grupoAlimentoId) FROM GrupoAlimento a")
	List<GrupoAlimento> getFirstGrupoAlimento();
}
