package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Contatos;
import br.ufc.quixada.npi.repository.ContatoRepository;

@Service
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	public ContatoServiceImpl() {
	}

	@Transactional
	public void insere() {
		contatoRepository.save(new Contatos("Carlos", "(88)3581-1234"));
		contatoRepository.save(new Contatos("Marina", "(88)3412-9876"));
		contatoRepository.save(new Contatos("Roberto", "(88)3412-8989"));
	}

	@Transactional
	public List<Contatos> findAll() {
		List<Contatos> l = contatoRepository.findAll();
		return l;
	}

}
