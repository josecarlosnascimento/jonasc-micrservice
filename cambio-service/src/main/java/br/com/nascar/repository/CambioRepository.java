package br.com.nascar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nascar.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
	
}
