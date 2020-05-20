package br.com.kca.springboot.eventos.springbooteventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.kca.springboot.eventos.springbooteventosapp.models.Aluno;

public interface EventoRepository extends CrudRepository<Aluno, String>  {

}
