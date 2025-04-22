package com.insurance.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.Nominee;
import com.insurance.repository.NomineeRepository;
import com.insurance.service.NomineeService;
@Service
public class NomineeServiceImpl implements NomineeService{

	@Autowired
	private NomineeRepository nomineeRepository;
	
	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nominee1 = nomineeRepository.save(nominee);
		return nominee1;
	}

	@Override
	public Nominee updateNominee(Nominee nominee) {
		Nominee nominee1 = nomineeRepository.save(nominee);
		return nominee1;
	}

	@Override
	public List<Nominee> getNominee(Integer id) {
		List<Nominee>  nominee1 = nomineeRepository.findAllNominee(id);
		return nominee1;
	}

	@Override
	public void deleteNominee(Integer id) {
		nomineeRepository.deleteById(id);
		
	}

	

	
}
