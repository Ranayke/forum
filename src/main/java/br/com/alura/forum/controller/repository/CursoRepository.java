package br.com.alura.forum.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	static Curso findByNome(String nome) {
		return null;
	}

	


}
