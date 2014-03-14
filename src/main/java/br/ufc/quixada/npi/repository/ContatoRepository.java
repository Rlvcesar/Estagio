package br.ufc.quixada.npi.repository;

import java.util.List;

import br.ufc.quixada.npi.model.Contatos;

public interface ContatoRepository {

	public abstract void save(Contatos c);

	public abstract List<Contatos> findAll();
	
}