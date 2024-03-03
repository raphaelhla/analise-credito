package com.raphaelagra.propostaapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raphaelagra.propostaapp.entity.Proposta;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta, Long>{

	List<Proposta> findAllByIntegradaIsFalse();
}
