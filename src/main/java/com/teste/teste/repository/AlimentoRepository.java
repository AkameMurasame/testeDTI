package com.teste.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.teste.entity.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Integer>{

}
