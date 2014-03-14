package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	/* (non-Javadoc)
	 * @see br.ufc.quixada.npi.service.PessoaService#inserir()
	 */
	@Transactional
	public void inserir() {
		pessoaRepository.save(new Pessoa("Marina", "Sousa"));
		pessoaRepository.save(new Pessoa("Alberto", "Roberto"));
		pessoaRepository.save(new Pessoa("Zé", "Augusto"));
	}

	/* (non-Javadoc)
	 * @see br.ufc.quixada.npi.service.PessoaService#findAll()
	 */
	@Transactional
	public List<Pessoa> findAll() {
		List<Pessoa> p = pessoaRepository.findAll();
		return p;

	}

}
