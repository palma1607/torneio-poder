package br.com.unicuritiba.torneiodopoder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.torneiodopoder.models.Lutador;

public interface LutadorRepository extends
	JpaRepository<Lutador, Long> {
}
