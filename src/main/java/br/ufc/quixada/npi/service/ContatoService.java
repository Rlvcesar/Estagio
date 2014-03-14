package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Contatos;

public interface ContatoService {

	public abstract void insere();

	public abstract List<Contatos> findAll();

}